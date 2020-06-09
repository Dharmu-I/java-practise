package com.java.practise.array;

import java.util.Arrays;

public class NextBiggerNumber {
    public static void main(String[] args) {
        int[] a = {2, 5, 9, 6, 3, 4, 8, 15, 12};
        System.out.println(Arrays.toString(a));
        printNextBiggerNumber(a);
        System.out.println(Arrays.toString(a));
    }

    private static void printNextBiggerNumber(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean higher = false;
            int j = i + 1;
            int currentValue = a[i];
            int valueToReplace = a[i];
            while (j < a.length) {
                if (!higher && currentValue < a[j]) {
                    higher = true;
                    valueToReplace = a[j];
                } else if (higher) {
                    if (valueToReplace > a[j] && a[j] > currentValue) {
                        valueToReplace = a[j];
                    }
                }
                j++;
            }
            a[i] = valueToReplace;
        }
    }
}
