package com.java.practise.array;

import java.util.Arrays;

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int index = 0;
        while (index < nums.length - 1) {
            if (nums[index] < nums[index + 1]) {
                break;
            }
            index++;
        }
        if ((index == nums.length - 1)) {
            Arrays.sort(nums);
            return;
        }
        swapWithNextBiggerNumber(index, nums);
    }

    public void swapWithNextBiggerNumber(int index, int[] nums) {
        int currentNumber = nums[index];
        int smallerNumber = Integer.MAX_VALUE;
        int swapIndex = index;
        int currentIndex = index;
        while (index < nums.length) {
            if (nums[index] > currentNumber && smallerNumber > nums[index]) {
                smallerNumber = nums[index];
                swapIndex = index;
            }
            index++;
        }
        int temp = nums[swapIndex];
        nums[swapIndex] = nums[currentIndex];
        nums[currentIndex] = temp;
        Arrays.sort(nums, currentIndex+1, nums.length);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(nums));
        new NextPermutation().nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("===============");
        int[] nums2 = {1, 3, 2};
        System.out.println(Arrays.toString(nums2));
        new NextPermutation().nextPermutation(nums2);
        System.out.println(Arrays.toString(nums2));

    }
}
