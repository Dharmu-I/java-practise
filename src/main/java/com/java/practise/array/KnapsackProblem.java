package com.java.practise.array;

public class KnapsackProblem {

    private static int getMaxItemWorthCanCarry(int w, int n, int[] val, int[] wt) {
        int[][] mat = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            mat[i][0] = 0;
        }
        for (int i = 0; i <= w; i++) {
            mat[0][i] = 0;
        }
        for (int item = 1; item <= n; item++) {
            for (int weight = 1; weight <= w; weight++) {
                int maxValueWithCurr = 0;
                int maxValueWithoutCurr = mat[item - 1][weight];
                int weightOfCurrentItem = wt[item - 1];
                if (weight >= weightOfCurrentItem) {
                    maxValueWithCurr = val[item - 1];
                    int remainingWeight = weight - weightOfCurrentItem;
                    maxValueWithCurr += mat[item - 1][remainingWeight];
                }
                mat[item][weight] = Math.max(maxValueWithCurr, maxValueWithoutCurr);
            }
        }

        return mat[n][w];
    }

    public static void main(String[] args) {
        int w = 10;
        int n = 5;
        int[] val = {10, 40, 30, 50, 10};
        int[] wt = {5, 4, 6, 3, 1};
        System.out.println("Max worth value items : " + getMaxItemWorthCanCarry(w, n, val, wt));
    }
}
