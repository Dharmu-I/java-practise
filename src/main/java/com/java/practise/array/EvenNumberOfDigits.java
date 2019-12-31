package com.java.practise.array;

public class EvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        EvenNumberOfDigits evenNumberOfDigits = new EvenNumberOfDigits();
        int[] nums = {12,345,2,6,7896};
        System.out.println(evenNumberOfDigits.findNumbers(nums));
        int[] nums1 = {0};
        System.out.println(evenNumberOfDigits.findNumbers(nums1));
        int[] nums2 = {};
        System.out.println(evenNumberOfDigits.findNumbers(nums2));
    }
}
