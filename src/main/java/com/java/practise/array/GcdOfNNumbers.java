package com.java.practise.array;

public class GcdOfNNumbers {

    public int generalizedGCD(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
        }
        return result;
    }

    public int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        if (a == b) {
            return a;
        }

        if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(a, b - a);
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,6,8};
        System.out.println(new GcdOfNNumbers().generalizedGCD(nums));
    }
}
