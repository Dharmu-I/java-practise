package com.java.practise.array;

import java.util.Arrays;

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int index = nums.length - 2;
        while (index >= 0) {
            if (nums[index] < nums[index + 1]) {
                break;
            }
            index--;
        }
        if ((index <= 0)) {
            Arrays.sort(nums);
        } else {
            int j = swapWithNextBiggerNumber(index + 1, nums);
            int temp = nums[index];
            nums[index] = nums[j];
            nums[j] = temp;
            Arrays.sort(nums, index + 1, nums.length);
        }
    }

    public int swapWithNextBiggerNumber(int index, int[] nums) {
        int smallIndex = index;
        int gt = nums[index - 1];

        for (int i = index; i < nums.length; i++) {
            if (nums[i] > gt && nums[i] < nums[smallIndex]) {
                smallIndex = i;
            }
        }
        return smallIndex;
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
        System.out.println("===============");
        int[] nums3 = {3, 2, 1};
        System.out.println(Arrays.toString(nums3));
        new NextPermutation().nextPermutation(nums3);
        System.out.println(Arrays.toString(nums3));

    }
}
