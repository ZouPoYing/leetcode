package com.leetcode.classic.josephring;

import java.util.*;

public class JosephRing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(josephRing(n, 2));
        }
    }

    public static int josephRing(int count, int step) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        int i = 0;
        while (list.size() > 1) {
            i = (i + step) % list.size();
            list.remove(i);
        }
        return list.get(0);
    }
}

