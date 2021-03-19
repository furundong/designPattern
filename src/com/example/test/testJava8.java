package com.example.test;

import java.util.Arrays;

/**
 * create by Freedom on 2020/4/27
 */

public class testJava8 {

    public static void main(String[] args) {
/*        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("list = " + list);
        Stream<Integer> integerStream = list.stream().filter(s -> s > 4);
        Object[] objects = integerStream.toArray();
        System.out.println("objects = " + Arrays.toString(objects));
 */
/* 给定一个无序的整数序列，求出它最长上升子序列的长度（要求严格上升）
比如 [10, 2, 2, 5, 1, 7, 101, 18] 的最长上升子序列是 [2, 5, 7, 101]、[2, 5, 7, 18]，长度是 4*/
        int[] nums = {10, 2, 2, 5, 1, 7, 101, 18};
        System.out.println(longestIncrSubSum(nums));
    }

    static int longestIncrSubSum(int[] nums) {
        int[] dp = new int[nums.length];
        int max = 1;
        Arrays.fill(dp, 1);
        //j=[0,i) -> dp(i) = nums(j) < nums[i] ? max{dp[i],dp[j]+1}
        //定义
        //当 nums[i] > nums[j]
        //✓ nums[i] 可以接在 nums[j] 后面，形成一个比 dp(j) 更长的上升子序列，长度为 dp(j) + 1
        //dp(i) = max { dp(i), dp(j) + 1 }
        //如不是，跳过这次遍历

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(dp[i], max);
        }
        System.out.println("dp = " + Arrays.toString(dp));
        return max;
    }
}
