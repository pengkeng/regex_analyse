package cn.ac.ios.TreeNode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static int gci(int n) {
        System.out.println(n);
        if (n == 0) {
            return n;
        } else {
            return gci(n - 1);
        }
    }

    public static void main(String[] args) {
//        gci(11000);
        Pattern pattern = Pattern.compile("([a-z]|[\\w])+");
        String str = "";
        for (int i = 0; i < 1000; i++) {
            str = str + "aaaaaaaaa";
            long time = System.currentTimeMillis();
            try {
                Matcher matcher = pattern.matcher(str+"!");
                boolean b = matcher.matches();
                System.out.println(System.currentTimeMillis() - time + " " + b + " " + str.length());
            }catch (Exception e){

            }
        }
    }
}
