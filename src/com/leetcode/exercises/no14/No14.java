package com.leetcode.exercises.no14;

import sun.text.normalizer.Trie;

//    https://leetcode-cn.com/problems/longest-common-prefix/
//    编写一个函数来查找字符串数组中的最长公共前缀。
//    如果不存在公共前缀，返回空字符串 ""。
public class No14 {

    public static void main(String[] args) {
        f();
    }

    public static String longestCommonPrefix(String[] strs) {
        String com = strs[0];
        for (String str : strs) {
            if (str.length() == 0) {
                return  "";
            }
            for( int i = 0; i < str.length(); i++) {
                if (i >= com.length()) {
                    com = com.substring(0, i);
                    break;
                }
                if (str.charAt(i) != com.charAt(i)) {
                    com = com.substring(0, i);
                    break;
                }
                if (i == str.length()-1) {
                    com = str;
                }
            }
        }
        return com;
    }

    public static void f(String[] strs) {
        System.out.println(longestCommonPrefix(strs));
    }

    public static void f() {
        System.out.println(longestCommonPrefix(new String[]{"abab","aba",""}));
    }
}
