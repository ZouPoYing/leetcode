package com.leetcode.classic.demo;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        System.out.println(f("XxyxyXxX"));
    }

    static String f(String str) {
        String cTemp = "";
        int numTemp;
        ArrayList<String> c = new ArrayList<String>();
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 0; str.length() > 0; i++) {
            c.add(String.valueOf(str.charAt(0)));
            num.add(str.length()-str.replaceAll(c.get(i),"").length());
            str = str.replaceAll(c.get(i),"");
        }
        char a = 'a';
        char A = 'A';
        System.out.println(A-a);
        System.out.println(str);
        System.out.println(c.toString());
        System.out.println(num.toString());
        for (int i = 0; i < num.size()-1; i++) {
            for (int j = 0; j < num.size() - (i+1); j++) {
                if (num.get(j) < num.get(j+1)) {
                    numTemp = num.get(j);
                    num.set(j,num.get(j+1));
                    num.set(j+1,numTemp);
                    cTemp = c.get(j);
                    c.set(j,c.get(j+1));
                    c.set(j+1,cTemp);
                }
            }
        }
        for (int i = 0; i < num.size()-1; i++) {
            for (int j = 0; j < num.size() - (i+1); j++) {
                if (num.get(j) == num.get(j+1)) {
                    if ((c.get(j).charAt(0) < c.get(j+1).charAt(0)) && (c.get(j).charAt(0) - c.get(j+1).charAt(0) == -32)) {
                        numTemp = num.get(j);
                        num.set(j,num.get(j+1));
                        num.set(j+1,numTemp);
                        cTemp = c.get(j);
                        c.set(j,c.get(j+1));
                        c.set(j+1,cTemp);
                    }
                }
            }
        }
        String result = "";
        for (int i = 0; i < num.size(); i++) {
            result += c.get(i) + ":" + num.get(i) + ";";
        }
        return result;
    }
}
