package com.java.practise.array;

import java.util.Arrays;

public class RecursiveSumOfArray {

    public static void recSumArray(int[] array, int i){
        if ( i >= array.length){
            return;
        }
        array[i] += array[i-1];
        recSumArray(array, i+1);
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(ints));
        recSumArray(ints, 1);
        System.out.println(Arrays.toString(ints));
    }
}
