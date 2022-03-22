package com.leetcode.exercises.no27;

import com.leetcode.exercises.no21.No21;

import java.util.Scanner;

public class No27 {

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        No21.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, No21.ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.next();
            String temp = "";
            for(int i = 0; i < str.length(); i++) {
                if (temp.contains(String.valueOf(str.charAt(i)))) {
                    continue;
                }
                temp = temp + str.charAt(i);
            }
            System.out.println(temp);

        }
    }

}

class Main{
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int sum = 0;
            String[] nums = sc.nextLine().split(" ");
            if (nums[0].equals("0")) {
                break;
            }
            for(int i = 1;i < nums.length; i++) {
                sum += Integer.valueOf(nums[i]);
            }
            System.out.println(sum);
        }
    }
}