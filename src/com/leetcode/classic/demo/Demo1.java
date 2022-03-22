package com.leetcode.classic.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;

public class Demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            List<String> str = Arrays.asList(sc.nextLine().split(","));
            if (!str.contains("0")) {
                System.out.println("-1");
            } else if (!str.contains("1")) {
                System.out.println("-1");
            }
            int in = 0;
            for (int i = 1; i <= 200; i++) {
                if (i*i == str.size()) {
                    in = i;
                }
            }
            int[][] a = new int [in][in];
            for (int i = 0; i < in; i++) {
                for (int j = 0; j < in; j++) {

                }
            }
        }
    }

    static int f(String str, int num) {
        ArrayList<String> c = new ArrayList<String>();
        ArrayList<Integer> n = new ArrayList<Integer>();
        c.add(String.valueOf(str.charAt(0)));
        n.add(1);
        int time = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                n.set(time-1, n.get(time-1)+1);
            } else {
                time++;
                c.add(String.valueOf(str.charAt(i)));
                n.add(1);
            }
        }
        String cTemp = "";
        int numTemp;
        for (int i = 0; i < n.size()-1; i++) {
            for (int j = 0; j < n.size() - (i+1); j++) {
                if (n.get(j) < n.get(j+1)) {
                    numTemp = n.get(j);
                    n.set(j,n.get(j+1));
                    n.set(j+1,numTemp);
                    cTemp = c.get(j);
                    c.set(j,c.get(j+1));
                    c.set(j+1,cTemp);
                }
            }
        }
        for (int i = 0; i < c.size()-1; i++) {
            if (num == 1) {
                return n.get(i);
            }
            if (c.get(i) == c.get(i+1)) {
                num--;
            }
        }
        return -1;
    }
}
