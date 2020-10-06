package com.java.leetcode;

public class JumpPossibleToReachEnd {

    public int canJump(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return 0;
        }
        int limit = nums[0];
        int ans = 0;
        int maxPossible = nums[0];
        for (int i = 1; i < length; i++) {
            if (i > limit) {
                ans++;
                limit = maxPossible;
            }
            maxPossible = Math.max(maxPossible, nums[i]);
        }
        return ans;
    }

    public boolean possibleJump(int[] nums) {
        int length = nums.length;
        int lastNumber = nums[length - 1];
        for (int i = length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastNumber) {
                lastNumber = i;
            }
        }
        return (lastNumber == 0);
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(new JumpPossibleToReachEnd().canJump(nums));
    }
}
