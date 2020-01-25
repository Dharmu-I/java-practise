package com.java.practise.dynamic_programming;

public class MinimumPathCost {


    private static int getMinCostValue(int[][] cost, int m, int n) {
        if ( m==0 && n == 0){
            return cost[m][n];
        }
        int x = Integer.MAX_VALUE,y=Integer.MAX_VALUE,z=Integer.MAX_VALUE;
        if (m-1 >= 0) {
            x = getMinCostValue(cost, m - 1, n);
        }
        if (n-1 >= 0) {
            y = getMinCostValue(cost, m, n - 1);
        }
        if (m-1 >=0 && n-1 >= 0){
            z = getMinCostValue(cost, m-1, n - 1);
        }
        return getMin(x,y,z)+cost[m][n];
    }

    private static int getMin(int x, int y,int z) {
        return Math.min(Math.min(x,y),z);
    }

    public static void main(String[] args) {
        int[][] cost = new int[][]{
                {1,3,5,8},
                {4,2,1,7},
                {4,3,2,3}
        };
        System.out.println("Min values " +getMinCostValue(cost,2,3));
    }
}
