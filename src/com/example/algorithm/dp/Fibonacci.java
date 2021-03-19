package com.example.algorithm.dp;

/**
 * create by Freedom on 2021/3/16
 */
public class Fibonacci {

    public static void main(String[] args) {

        //1 1 2 3 5 8
        System.out.println(fib4(6));
    }

    //4. 特殊实现
    static int fib(int num) {
        int first = 1, second = 1;
        for (int i = 3; i <= num; i++) {
            second = first + second;
            first = second - first;
        }
        return second;
    }

    //3. 动态规划
    //dp[i] = dp[i - 1] + dp[i - 2];
    static int fib4(int num) {
        int[] dp = new int[num + 1];
        dp[1] = 1;
        dp[2] = 1;
        // 1 , 1 , 2 ,
        for (int i = 3; i <= num; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[num];
    }


    //2. 记忆化搜索
    static int fib3(int num) {
        //这个数组是干嘛用的呢？
        //数组就是你要的值。 比如，你想求第三个数， 1 1 2 那么你这个dp[3] ， 就是你要的那个数。
        int[] dp = new int[num + 1];
        return fib3(dp, num);
    }

    static int fib3(int[] dp, int num) {
        if (num <= 0) {
            return 0;
        }
        if (num == 1 || num == 2) {
            dp[1] = 1;
            dp[0] = 1;
            return 1;
        }
        if (dp[num] == 0) {
            dp[num] = fib3(dp, num - 1) + fib3(dp, num - 2);
        }
        return dp[num];
    }


    //1. 暴力递归
    //这个函数的意义是， 给我一个数， 我返回这个数， 数前两个相加的结果

    static int fib2(int num) {
        if (num <= 0) {
            return 0;
        }
        if (num == 1 || num == 2) {
            return 1;
        }
        return fib2(num - 1) + fib2(num - 2);
    }
}
