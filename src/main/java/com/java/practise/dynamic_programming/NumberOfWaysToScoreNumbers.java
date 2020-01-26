package com.java.practise.dynamic_programming;

public class NumberOfWaysToScoreNumbers {

    public static int getNumberOfWays(int n){
        if (n < 0){
            return 0;
        }
        if (n == 0){
            return 1;
        }
        return getNumberOfWays(n-3) + getNumberOfWays(n-5) + getNumberOfWays(n-10);
    }

    public static int getNumberOfWaysDp(int n){
        int[] ways = new int[n+1];
        ways[0] = 1;
        for (int i = 1; i <= n; i++){
            if (i - 10 >= 0){
                ways[i] += ways[i-10];
            }
            if (i - 3 >= 0){
                ways[i] += ways[i-3];
            }
            if (i - 5 >= 0){
                ways[i] += ways[i-5];
            }
        }
        return ways[n];
    }

    public static void main(String[] args) {
        System.out.println(getNumberOfWays(13));
        System.out.println(getNumberOfWaysDp(13));
    }
}
