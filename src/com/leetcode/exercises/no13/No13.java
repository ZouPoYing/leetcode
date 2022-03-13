package com.leetcode.exercises.no13;

import java.util.HashMap;

//    https://leetcode-cn.com/problems/roman-to-integer/
//    罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
//            字符          数值
//            I             1
//            V             5
//            X             10
//            L             50
//            C             100
//            D             500
//            M             1000
//    例如， 罗马数字 2 写做 II ，即为两个并列的 1 。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
//
//    通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
//
//    I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
//    X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
//    C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
//    给定一个罗马数字，将其转换成整数。
public class No13 {

    public static void main(String[] args) {
        f();
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> table = new HashMap<>();
        table.put('I', 1);
        table.put('a', 4);
        table.put('V', 5);
        table.put('b', 9);
        table.put('X', 10);
        table.put('c', 40);
        table.put('L', 50);
        table.put('d', 90);
        table.put('C', 100);
        table.put('e', 400);
        table.put('D', 500);
        table.put('f', 900);
        table.put('M', 1000);
        int num = 0;
        s = s.replaceAll("IV", "a").replaceAll("IX", "b").replaceAll("XL", "c")
                .replaceAll("XC", "d").replaceAll("CD", "e").replaceAll("CM", "f");
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                num = table.get(s.charAt(i));
                continue;
            }
            if (table.get(s.charAt(i)) > table.get(s.charAt(i-1))) {
                num = table.get(s.charAt(i)) - num;
            } else {
                num += table.get(s.charAt(i));
            }
        }
        return num;
    }

    public static void f(String s) {
        System.out.println(romanToInt(s));
    }

    public static void f() {
        System.out.println(romanToInt("IX"));
    }

}
