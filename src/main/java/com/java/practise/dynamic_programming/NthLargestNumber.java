package com.java.practise.dynamic_programming;

import java.util.Arrays;

public class NthLargestNumber {

    public static void main(String[] args) {
        int[] array = {3, 4, 1, 5, 6, 0, 12, 9};
        System.out.println(getNthLargestNumber(array, 3));
    }

    private static int getNthLargestNumber(int[] array, int nthNumber) {
        int[] fixedArray = new int[nthNumber];
        Arrays.fill(fixedArray, Integer.MIN_VALUE);
        for (int value : array) {
            if (fixedArray[fixedArray.length - 1] < value) {
                for (int j = 0; j < fixedArray.length; j++) {
                    if (value > fixedArray[j]) {
                        int prevValue = fixedArray[j];
                        fixedArray[j] = value;
                        shiftNumberFrom(fixedArray, j + 1, prevValue);
                        break;
                    }
                }
            }
        }
        return fixedArray[nthNumber-1];
    }

    private static void shiftNumberFrom(int[] fixedArray, int j, int prevValue) {
        if (j < fixedArray.length) {
            int prevElement = prevValue;
            for (int k = j; k < fixedArray.length; k++) {
                fixedArray[k] = prevElement;
                prevElement = fixedArray[k];
            }
        }
    }
}
