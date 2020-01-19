package com.java.practise.dynamic_programming;

public class NonAdjuscentSubSetSum {

    static int maxSubsetSum(int[] arr) {
        int n = arr.length;
        int maxSum = 0;
        for(int i = 0; i < 1<<n; i++){
            int sum = 0,prev_j = -1;
            System.out.print("{");
            for(int j=0; j<n; j++){
                if((i & 1<<j) > 0 && (prev_j == -1 || Math.abs(prev_j - j) != 1)){
                    System.out.print(arr[j]+" ");
                    sum += arr[j];
                    prev_j = j;
                }
            }
            System.out.println("}");
            if(maxSum < sum){
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] a = {2,1,5,8,4};
        System.out.println("Max subset sum : "+maxSubsetSum(a));
    }
}
