package com.leetcode.exercises.no21;

//    https://leetcode-cn.com/problems/merge-two-sorted-lists/
//    将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//    no21_01.jpg
public class No21 {

    public static void main(String[] args) {
        f();
    }

    /**
     * Definition for singly-linked list.
     */
     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        ListNode list = new ListNode(0);
        mergeTwoLists(list1,list2,list);
        return list.next;
    }

    public static void mergeTwoLists(ListNode list1, ListNode list2, ListNode list) {
        if (list1 == null) {
            list.next = list2;
            return;
        }
        if (list2 == null) {
            list.next = list1;
            return;
        }
        if (list1.val < list2.val) {
            list.next = list1;
            list1 = list1.next;
        } else {
            list.next = list2;
            list2 = list2.next;
        }
        mergeTwoLists(list1,list2,list.next);
    }

    public static void f() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        System.out.println(mergeTwoLists(list1,list2));
    }
}
