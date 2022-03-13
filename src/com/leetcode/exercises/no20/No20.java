package com.leetcode.exercises.no20;

//    https://leetcode-cn.com/problems/valid-parentheses/
//    给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//    有效字符串需满足：
//    左括号必须用相同类型的右括号闭合。
//    左括号必须以正确的顺序闭合。
public class No20 {

    public static void main(String[] args) {
        f();
    }

    public static boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        } else if (s.length()%2 == 1) {
            return false;
        }
        String str = "";
        int length = s.length();
        do {
            length = s.length();
            s = s.replaceAll("\\(\\)", "").replaceAll("\\{\\}", "").replaceAll("\\[\\]", "");
        } while (s.length() != length);
        if (length == 0) {
            return true;
        } else {
            return false;
        }
//        int tail = s.length();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) != s.charAt(tail)) {
//                return false;
//            }
//            if (tail - i == 1) {
//                return true;
//            }
//            tail--;
//        }
    }

    public static void f(String s) {
        System.out.println(isValid(s));
    }

    public static void f() {
        System.out.println(isValid("(){[}[]]"));
    }

}
