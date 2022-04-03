package cn.ac.ios.TreeNode;

import cn.ac.ios.Bean.BaseDataBean;
import cn.ac.ios.Bean.Regexps;
import cn.ac.ios.PCRE.PCREBuilder;
import cn.ac.ios.PCRE.PCREParser;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Logger;


public class Utils {

    public static HashMap<String, String> errorMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
//        String regex = "/\\w+?b{2,3}[[0-9]&&\\d0-9&&\\w1-3](a++)\\1/()";
//        single();
        extractedSize("data/java/java.clear.multiline.json", "java.txt", "data/java/");
        extractedSize("data/csharp/csharp.clear.multiline.json", "csharp.txt", "data/csharp/");
        extractedSize("data/perl/perl.clear.multiline.json", "perl.txt", "data/perl/");
        extractedSize("data/php/php.clear.multiline.flag.json", "php.txt", "data/php/");
        extractedSize("data/python/python.clear.multiline.json", "python.txt", "data/python/");


//        ArrayList<BaseDataBean> dataBeanArrayList = new Gson().fromJson(FileUtils.readFileToString(new File("data/java/java.clear.multiline.unique.json"), "utf-8"), new TypeToken<ArrayList<BaseDataBean>>() {
//        }.getType());
//        HashSet<String> data = new HashSet<>();
//        for (BaseDataBean baseDataBean : dataBeanArrayList) {
//            for (Regexps regexps : baseDataBean.getRegexps()) {
//                String pattern = regexps.getPattern().replace("\n", "\\n").replace("\r", "\\r");
//                if (pattern.length() > 2) {
//                    data.add(pattern);
//                }
//            }
//        }
//        System.out.println(data.size());
//        FileUtils.writeLines(new File("data/java/java.clear.unique.txt"), data);
//        ArrayList<String> data = (ArrayList<String>) FileUtils.readLines(new File("data/java/java.clear.unique.txt"), "utf-8");
//        ArrayList<String> subdata = new ArrayList<>();
//        int index = 1;
//        for (int i = 1; i <= data.size(); i++) {
//            subdata.add(data.get(i - 1));
//            if (i % 1000 == 0) {
//                FileUtils.writeLines(new File("/Users/pqc/Desktop/java/" + index + ".txt"), subdata);
//                index++;
//                subdata.clear();
//            }
//        }
//        FileUtils.writeLines(new File("/Users/pqc/Desktop/java/" + index + ".txt"), subdata);

    }

    private static void extracted(String input, String output, String path) throws IOException {
        String regex;
        ArrayList<BaseDataBean> dataBeanArrayList = new Gson().fromJson(FileUtils.readFileToString(new File(input), "utf-8"), new TypeToken<ArrayList<BaseDataBean>>() {
        }.getType());
        ArrayList<String> data = new ArrayList<>();
        ArrayList<String> flags = new ArrayList<>();
        for (BaseDataBean baseDataBean : dataBeanArrayList) {
            for (Regexps regexps : baseDataBean.getRegexps()) {
                String pattern = regexps.getPattern();
                data.add(pattern);
                flags.add(regexps.getFlags());
            }
        }
        ArrayList<String> errorList = new ArrayList<>();
        ArrayList<String> resultList = new ArrayList<>();
        ArrayList<String> flagsList = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        int count = 0;
        ArrayList<String> newData = new ArrayList<>(data);
        for (int i = 0; i < newData.size(); i++) {
            regex = newData.get(i);
            Logger.getGlobal().info(i + "   -->>:" + regex);
            HashMap<String, ArrayList<ParserRuleContext>> subHashMap = new HashMap<>();
            ArrayList<String> list = new ArrayList<>();
//            if (flag.length() > 0) {
//                list.add(flag);
//            }
            try {
                PCREBuilder.Tree tree = new PCREBuilder.Tree(regex);
                tree.traverse();
                subHashMap = tree.hashMap;
                list.addAll(tree.arrayList);
            } catch (Exception e) {
                try {
                    regex = regex.replace("\\\\", "\\");
                    PCREBuilder.Tree tree = new PCREBuilder.Tree(regex);
                    tree.traverse();
                    subHashMap = tree.hashMap;
                    list.addAll(tree.arrayList);
                } catch (Exception e1) {
                    try {
                        regex = newData.get(i).replace("\\", "\\\\");
                        PCREBuilder.Tree tree = new PCREBuilder.Tree(regex);
                        tree.traverse();
                        subHashMap = tree.hashMap;
                        list.addAll(tree.arrayList);
                    } catch (Exception e2) {
                        errorList.add(regex);
                        Logger.getGlobal().info("Error -->>:" + regex);
                        continue;
                    }
                }
            }
            for (String key : subHashMap.keySet()) {
                hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
            }
            resultList.add(mapToString(subHashMap));
            StringBuilder stringBuilder = new StringBuilder();
            if (!list.isEmpty()) {
                for (String str : list) {
                    str = str.replace(" ", "");
                    if (str.length() > 0) {
                        stringBuilder.append(str).append(" ");
                    }
                }
            }
            flagsList.add(stringBuilder.toString());
        }
        Logger.getGlobal().info(String.valueOf(count));
        FileUtils.writeLines(new File(path + "localflag_" + output), flagsList);
        FileUtils.writeLines(new File(path + "flag_" + output), flags);
        FileUtils.writeLines(new File(path + "error_" + output), errorList);
        FileUtils.writeLines(new File(path + "result_" + output), resultList);
        ArrayList<String> list = new ArrayList<>();
        for (String key : hashMap.keySet()) {
            list.add(key + " : " + hashMap.get(key));
        }
        FileUtils.writeLines(new File(path + "2.0_" + output), list);
        System.out.println(errorList.size());
    }

    private static void extractedSize(String input, String output, String path) throws IOException {
        String regex;
        ArrayList<BaseDataBean> dataBeanArrayList = new Gson().fromJson(FileUtils.readFileToString(new File(input), "utf-8"), new TypeToken<ArrayList<BaseDataBean>>() {
        }.getType());
        ArrayList<String> data = new ArrayList<>();
//        HashSet<String> data = new HashSet<>();
        for (BaseDataBean baseDataBean : dataBeanArrayList) {
            for (Regexps regexps : baseDataBean.getRegexps()) {
                String pattern = regexps.getPattern();
                data.add(pattern);
            }
        }
        ArrayList<Integer> lenList = new ArrayList<>();
        ArrayList<Integer> nestList = new ArrayList<>();
        ArrayList<Integer> starHeightList = new ArrayList<>();
        ArrayList<Integer> quantifierHeightList = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            regex = data.get(i);
//            lenList.add(regex.length());
//            int count = 0;
//            int starHeight = 0;
            int n = 0;
            Logger.getGlobal().info(i + "   -->>:" + regex);
            try {
                PCREBuilder.Tree tree = new PCREBuilder.Tree(regex);
//                    int[] ints = tree.getNestAndStar();
//                    count = ints[0];
//                    starHeight = ints[1];
                n = tree.getQuantifier();
            } catch (Exception e) {
                try {
                    regex = regex.replace("\\\\", "\\");
                    PCREBuilder.Tree tree = new PCREBuilder.Tree(regex);
//                    int[] ints = tree.getNestAndStar();
//                    count = ints[0];
//                    starHeight = ints[1];
                    n = tree.getQuantifier();
                } catch (Exception e1) {
                    try {
                        regex = data.get(i).replace("\\", "\\\\");
                        PCREBuilder.Tree tree = new PCREBuilder.Tree(regex);
                        n = tree.getQuantifier();
//                        count = ints[0];
//                        starHeight = ints[1];
                    } catch (Exception ignored) {

                    }
                }
            }
//            nestList.add(count);
//            starHeightList.add(starHeight);
            quantifierHeightList.add(n);
        }
//        System.out.println(lenList.size());
//        System.out.println(nestList.size());
//        nestList.sort(Comparator.naturalOrder());
//        QuantifierHeightList.add(n)
//        FileUtils.writeLines(new File(path + "len_" + output), lenList);
//        FileUtils.writeLines(new File(path + "nest_" + output), nestList);
//        FileUtils.writeLines(new File(path + "star_height_" + output), starHeightList);
        FileUtils.writeLines(new File(path + "quantifier_height_" + output), quantifierHeightList);
    }

    public static void single() {
        String regex = "/\\w+?b{2,3}[[0-9]&&\\d0-9&&\\w1-3](a++)\\1/i";
//        regex = "/abc/i";
        regex = "^[^abc\\112]((?=(abc))|abc|\\da[abc0-9]+)+(?=((a+)+|b)+)+\\12";
        PCREBuilder.Tree tree = new PCREBuilder.Tree(regex);
        System.out.println(tree.toStringASCII());
        tree.traverse();
        HashMap<String, ArrayList<ParserRuleContext>> hashMap = tree.hashMap;
        System.out.println(hashMap.size());
        System.out.println(tree.getNest());
        System.out.println(tree.getStar());
    }

    public static String mapToString(HashMap<String, ArrayList<ParserRuleContext>> hashMap) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String key : hashMap.keySet()) {
            stringBuilder.append(key).append(" ");
        }
        return stringBuilder.toString();
    }

}
