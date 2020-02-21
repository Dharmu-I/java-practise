package com.java.practise.leetCode;


/**
 * dharmu.i on 18/03/19
 */

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i < nums.length-1;i++ ){
            for (int j=i+1; j < nums.length;j++){
                if (nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] returnValues = TwoSum.twoSum(new int[]{2, 7, 11, 15},9);
        System.out.println(returnValues[0]);
        System.out.println(returnValues[1]);
    }
}
