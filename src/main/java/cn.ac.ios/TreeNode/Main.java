package cn.ac.ios.TreeNode;

import cn.ac.ios.Bean.BaseDataBean;
import cn.ac.ios.Bean.Regexps;
import cn.ac.ios.PCRE.PCREBuilder;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.io.FileUtils;

import javax.inject.Qualifier;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {

    public static HashMap<String, String> errorMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
//        String regex = "/\\w+?b{2,3}[[0-9]&&\\d0-9&&\\w1-3](a++)\\1/()";
        single();


//        ArrayList<BaseDataBean> dataBeanArrayList = new Gson().fromJson(FileUtils.readFileToString(new File("data/java/java.clear.multiline.json"), "utf-8"), new TypeToken<ArrayList<BaseDataBean>>() {
//        }.getType());
//        HashSet<String> data = new HashSet<>();
////        HashSet<String> data = new HashSet<>();
//        for (BaseDataBean baseDataBean : dataBeanArrayList) {
//            for (Regexps regexps : baseDataBean.getRegexps()) {
//                String pattern = regexps.getPattern();
//                pattern = pattern.replace("\n","\\n").replace("\r","\\r");
//                data.add(pattern);
//            }
//        }
//        System.out.println(data.size());
//        FileUtils.writeLines(new File("data/java/" + "ja_regex.txt"), data);
    }


    @Deprecated
    public static void single() {
        String regex = "\\u1234\\x{0f}\\Q\\134/\\w+?b{2,3}[[0-9]&&\\d0-9&&\\w1-3](a++)\\1(?'first'a+) and again (\\k{first})/i";
//        regex = "/abc/i";
//        regex = "\\\\u([0-9a-f]{4}+)";
        regex = "(?x)(?<!\\\\)\\\\((?!\\\\?)";
//        regex = "";
        PCREBuilder.Tree tree = new PCREBuilder.Tree(regex);
        System.out.println(tree.toStringASCII());
        tree.traverse();
        HashMap<String, ArrayList<ParserRuleContext>> hashMap = tree.hashMap;
        System.out.println(hashMap.size());
    }
}
