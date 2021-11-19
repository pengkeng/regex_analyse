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
        String regex = "/\\w+?b{2,3}[[0-9]&&\\d0-9&&\\w1-3](a++)\\1/()";
//        single();
        extracted("data/csharp/csharp.clear.multiline.json", "csharp.txt", "data/csharp/");
//        extractedSize("data/java/java.clear.multiline.json", "java.txt");
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
            regex = "(?xn)(^|;)(\"\"(?<field>[^\"\"]*)\"\" | (?<field>[^;\"\"]*))(?=;|$)";
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
        FileUtils.writeLines(new File(path + "error_" + output), errorList);
        FileUtils.writeLines(new File(path + "result_" + output), resultList);
        ArrayList<String> list = new ArrayList<>();
        for (String key : hashMap.keySet()) {
            list.add(key + " : " + hashMap.get(key));
        }
        FileUtils.writeLines(new File(path + output), list);
        System.out.println(errorList.size());
    }

    private static void extractedSize(String input, String output) throws IOException {
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
        for (int i = 0; i < data.size(); i++) {
            regex = data.get(i);
            lenList.add(regex.length());
            int count = 0;
            Logger.getGlobal().info(i + "   -->>:" + regex);
            try {
                PCREBuilder.Tree tree = new PCREBuilder.Tree(regex);
                count = tree.getNest();
            } catch (Exception e) {
                try {
                    regex = regex.replace("\\\\", "\\");
                    PCREBuilder.Tree tree = new PCREBuilder.Tree(regex);
                    count = tree.getNest();
                } catch (Exception ignored) {
                }
            }
            nestList.add(count);
        }
        System.out.println(lenList.size());
        System.out.println(nestList.size());
        nestList.sort(Comparator.naturalOrder());
        FileUtils.writeLines(new File("data/java/" + "len_" + output), lenList);
        FileUtils.writeLines(new File("data/java/" + "nest_" + output), nestList);
    }

    public static void single() {
        String regex = "/\\w+?b{2,3}[[0-9]&&\\d0-9&&\\w1-3](a++)\\1/i";
//        regex = "/abc/i";
        regex = "((?=(abc))|abc|\\da[abc0-9]+)+(?=((a+)+|b)+)+";
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
