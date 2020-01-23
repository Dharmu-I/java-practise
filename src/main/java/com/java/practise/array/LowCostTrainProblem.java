package com.java.practise.array;

public class LowCostTrainProblem {

    static int[][] cost = new int[][]{
            {0, 10, 75, 94},
            {-1, 0, 35, 50},
            {-1, -1, 0, 80},
            {-1, -1, -1, 0}
    };

    public static int lowCostValue(int s, int d){
        if (s == d || s == d-1){
            return cost[s][d];
        }

        int minCost = cost[s][d];
        for (int i = s+1; i < d; i++){
            int temp = lowCostValue(s, i) + lowCostValue(i, d);
            if (temp < minCost){
                minCost = temp;
            }
        }
        return minCost;
    }

    public static void main(String[] args) {
        System.out.println("Cost of the destination " + lowCostValue(0,3));
        System.out.println("Cost of the destination " + lowCostValue(0,2));
    }
}
