package com.java.practise.dynamic_programming;

public class MaxSubSetSum {

    static int maxSubsetSum(int[] arr) {
        int n = arr.length;
        int maxSum = 0;
        for(int i = 0; i < 1<<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                if((i & 1<<j) > 0){
                    sum += arr[j];
                }
            }
            if(maxSum < sum){
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] a = {1,-10,5,3,-6};
        System.out.println("Max sum is : "+maxSubsetSum(a));
    }
}
