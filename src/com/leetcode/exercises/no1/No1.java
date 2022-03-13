package com.leetcode.exercises.no1;

import java.util.Arrays;
// https://leetcode-cn.com/problems/two-sum/
//    1. 两数之和 简单
//    给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
//    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//    你可以按任意顺序返回答案。
public class No1 {

    public static void main(String[] args) {
        f();
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] tarArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    tarArray[0] = i;
                    tarArray[1] = j;
                    return tarArray;
                }
            }
        }
        return tarArray;
    }

    public static void f(int[] nums, int target) {
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static void f() {
        int[] array = new int[]{1,2,3,4,5,6};
        int target = 4;
        System.out.println(Arrays.toString(twoSum(array,target)));
    }
}
