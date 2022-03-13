package com.leetcode.exercises.no9;

import com.leetcode.exercises.no7.No7;

//    https://leetcode-cn.com/problems/palindrome-number/
//    给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
//    回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//    例如，121 是回文，而 123 不是。
public class No9 {

    public static void main(String[] args) {
        f();
    }

    public static boolean isPalindrome(int x) {
        return new StringBuffer(Integer.toString(x)).reverse().toString().equals(Integer.toString(x));
    }

    public static void f(int x) {
        System.out.println(isPalindrome(x));
    }

    public static void f() {
        System.out.println(isPalindrome(121));
    }
}
