package com.leetcode.exercises.no7;
//7. 整数反转 简单
//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
//如果反转后整数超过 32 位的有符号整数的范围 [−2^31,  2^31 − 1] ，就返回 0。
//假设环境不允许存储 64 位整数（有符号或无符号）。
public class No7 {

    public static int reverse(int x) {
        String revNum = new StringBuffer(Integer.toString(x)).reverse().toString().replace("-","");
        int[] num = new int[]{2,1,4,7,4,8,3,6,4,7};
        if (revNum.length() < 10) {
            return x >= 0 ? Integer.parseInt(revNum) : Integer.parseInt('-' + revNum);
        } else if (revNum.length() == 10) {
            for (int i = 0; i < revNum.length(); i++) {
                if (Integer.parseInt(String.valueOf(revNum.substring(i,i+1))) < num[i]) {
                    return x >= 0 ? Integer.parseInt(revNum) : Integer.parseInt('-' + revNum);
                } else if (Integer.parseInt(String.valueOf(revNum.substring(i,i+1))) == num[i]) {
                    continue;
                } else if (Integer.parseInt(String.valueOf(revNum.substring(i,i+1))) > num[i]) {
                    return 0;
                }
            }
        }
        return 0;
    }

    public static void f(int x) {
        System.out.println(reverse(x));
    }

    public static void f() {
        System.out.println(reverse(-123456));
    }
}
