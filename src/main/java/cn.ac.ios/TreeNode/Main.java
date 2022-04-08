package cn.ac.ios.TreeNode;

import cn.ac.ios.REGEX.REGEXBuilder;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static HashMap<String, String> errorMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
//        String regex = "/\\w+?b{2,3}[[0-9]&&\\d0-9&&\\w1-3](a++)\\1/()";
        single();

//        local_flag("data/js/localflag_js.txt");
//        flagJs("data/js/flag_js.txt");

    }

    private static void flagJs(String file) throws IOException {
        ArrayList<String> list = (ArrayList<String>) FileUtils.readLines(new File(file), "utf-8");
        HashSet<Character> flags = new HashSet<>();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        flags.add('i');
        flags.add('g');
        flags.add('m');
        flags.add('s');
        flags.add('x');
        int count = 0;
        for (String str : list) {
            str = str.toLowerCase();
            if (str.replace(" ", "").length() > 0) {
                count++;
            } else {
                continue;
            }
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                Character character = str.charAt(i);
                if (flags.contains(character)) {
                    set.add(character);
                }
            }
            for (Character character : set) {
                hashMap.put(character, hashMap.getOrDefault(character, 0) + 1);
            }
        }
        System.out.println(count);
        for (Character key : hashMap.keySet()) {
            System.out.println(key + " " + hashMap.get(key));
        }
    }

    private static void flagPerl(String file) throws IOException {
        ArrayList<String> list = (ArrayList<String>) FileUtils.readLines(new File(file), "utf-8");
        HashSet<Character> flags = new HashSet<>();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        flags.add('i');
        flags.add('g');
        flags.add('m');
        flags.add('s');
        flags.add('x');
        int count = 0;
        for (String str : list) {
            str = str.toLowerCase();
            if (str.replace(" ", "").length() > 0) {
                count++;
            } else {
                continue;
            }
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                Character character = str.charAt(i);
                if (flags.contains(character)) {
                    set.add(character);
                }
            }
            for (Character character : set) {
                hashMap.put(character, hashMap.getOrDefault(character, 0) + 1);
            }
        }
        System.out.println(count);
        for (Character key : hashMap.keySet()) {
            System.out.println(key + " " + hashMap.get(key));
        }
    }

    private static void flagJava(String file) throws IOException {
        ArrayList<String> list = (ArrayList<String>) FileUtils.readLines(new File(file), "utf-8");
        HashSet<Character> flags = new HashSet<>();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        flags.add('i');
        flags.add('g');
        flags.add('m');
        flags.add('s');
        flags.add('x');
        int count = 0;
        for (String str : list) {
            str = str.toUpperCase();
            str = str.replace("Pattern.".toUpperCase(), "");
            str = str.replace("MULTILINE", "M");
            str = str.replace("CASE_INSENSITIVE", "I");
            str = str.replace("COMMENTS", "X");
            str = str.replace("DOTALL", "S");
            str = str.toLowerCase();
            if (str.replace(" ", "").length() > 0) {
                count++;
            } else {
                continue;
            }
            String[] strs = str.split("(\\|)");
            HashSet<Character> set = new HashSet<>();
            for (String f : strs) {
                if (f.length() == 1 && flags.contains(f.charAt(0))) {
                    set.add(f.charAt(0));
                }
            }
            for (Character character : set) {
                hashMap.put(character, hashMap.getOrDefault(character, 0) + 1);
            }
        }
        System.out.println(count);
        for (Character key : hashMap.keySet()) {
            System.out.println(key + " " + hashMap.get(key));
        }
    }

    private static void flag(String file) throws IOException {
        ArrayList<String> list = (ArrayList<String>) FileUtils.readLines(new File(file), "utf-8");
        HashSet<Character> flags = new HashSet<>();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        flags.add('i');
        flags.add('g');
        flags.add('m');
        flags.add('s');
        flags.add('x');
        int count = 0;
        for (String str : list) {
            str = str.toUpperCase();
            str = str.replace("Pattern.".toUpperCase(), "");
            str = str.replace("MULTILINE", "M");
            str = str.replace("IGNORECASE", "I");
            str = str.replace("VERBOSE", "X");
            str = str.replace("DOTALL", "S");
            str = str.replace("FLAGLESS", "");
            str = str.toLowerCase();
            if (str.replace(" ", "").length() > 0) {
                count++;
            } else {
                continue;
            }
            String[] strs = str.split("(\\|)");
            HashSet<Character> set = new HashSet<>();
            for (String f : strs) {
                if (f.length() == 1 && flags.contains(f.charAt(0))) {
                    set.add(f.charAt(0));
                }
            }
            for (Character character : set) {
                hashMap.put(character, hashMap.getOrDefault(character, 0) + 1);
            }
        }
        System.out.println(count);
        for (Character key : hashMap.keySet()) {
            System.out.println(key + " " + hashMap.get(key));
        }
    }

    private static void local_flag(String file) throws IOException {
        ArrayList<String> list = (ArrayList<String>) FileUtils.readLines(new File(file), "utf-8");
        ArrayList<String> arrayList = new ArrayList<>();
        HashSet<Character> flags = new HashSet<>();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        flags.add('i');
        flags.add('g');
        flags.add('m');
        flags.add('s');
        flags.add('x');
        int count = 0;
        for (String str : list) {
            if (str.replace(" ", "").length() > 0) {
                count++;
            } else {
                continue;
            }
            String[] strs = str.split("( |\\|)");
            HashSet<Character> set = new HashSet<>();
            for (String f : strs) {
                HashSet<Character> hashSet;
                if (f.startsWith("-")) {
                    hashSet = new HashSet<>(flags);
                    for (int j = 0; j < f.length(); j++) {
                        hashSet.remove(f.charAt(j));
                    }
                } else if (str.contains("-")) {
                    hashSet = new HashSet<>();
                    for (int j = 0; j < f.indexOf("-"); j++) {
                        if (flags.contains(f.charAt(j))) {
                            hashSet.add(f.charAt(j));
                        }
                    }
                } else {
                    hashSet = new HashSet<>();
                    for (int j = 0; j < f.length(); j++) {
                        if (flags.contains(f.charAt(j))) {
                            hashSet.add(f.charAt(j));
                        }
                    }
                }
                set.addAll(hashSet);
            }
            for (Character character : set) {
                hashMap.put(character, hashMap.getOrDefault(character, 0) + 1);
            }
        }
        System.out.println(count);
        for (Character key : hashMap.keySet()) {
            System.out.println(key + " " + hashMap.get(key));
        }
    }


    @Deprecated
    public static void single() {
        String regex = "\\u1234\\x{0f}\\Q\\134/\\w+?b{2,3}[[0-9]&&\\d0-9&&\\w1-3](a++)\\1(?'first'a+) and again (\\k{first})/i";
//        regex = "/abc/i";
//        regex = "\\\\u([0-9a-f]{4}+)";
        regex = "((?>(?:a+))a+?aa?+)++";
//        regex = "";
        REGEXBuilder.Tree tree = new REGEXBuilder.Tree(regex);
        System.out.println(tree.toStringASCII());
        int a = tree.getNest();
        System.out.println(a);
//        HashMap<String, ArrayList<ParserRuleContext>> hashMap = tree.hashMap;
//        System.out.println(hashMap.size());
    }
}
