package com.java.practise.dynamic_programming;

public class MaxSum {

    public static int maxSumSoFar(int[] array){
        int sumSoFar = 0;
        int maxSumSoFar = 0;

        for (int value : array) {
            sumSoFar = sumSoFar + value;
            if (sumSoFar < 0) {
                sumSoFar = 0;
            }
            if (maxSumSoFar < sumSoFar) {
                maxSumSoFar = sumSoFar;
            }
        }
        return maxSumSoFar;
    }

    public static void main(String[] args) {
        int[] array = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Max numbers " +maxSumSoFar(array));
    }
}
