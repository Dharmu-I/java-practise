package com.java.practise.array;

import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int[] array) {
        divideTheArray(array, new int[array.length], 0, array.length - 1);
    }

    private void divideTheArray(int[] array, int[] temp, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        divideTheArray(array, temp, start, mid);
        divideTheArray(array, temp, mid + 1, end);
        mergeTheSortedArray(array, temp, start, end);
    }

    private void mergeTheSortedArray(int[] array, int[] temp, int start, int end) {
        int leftEnd = (start + end) / 2;
        int rightStart = leftEnd + 1;
        int index = start;
        int size = end - start + 1;
        int initial = start;

        while (start <= leftEnd && rightStart <= end) {
            if (array[start] < array[rightStart]) {
                temp[index] = array[start];
                start++;
            } else {
                temp[index] = array[rightStart];
                rightStart++;
            }
            index++;
        }
        while (start <= leftEnd) {
            temp[index] = array[start];
            start++;
            index++;
        }

        while (rightStart <= end) {
            temp[index] = array[rightStart];
            rightStart++;
            index++;
        }
        System.arraycopy(temp, initial, array, initial, size);
    }


    public static void main(String[] args) {
        int[] array = {2, 3, 1, 4, 5, 1, 9};
        new MergeSort().mergeSort(array);
        System.out.println("Array " + Arrays.toString(array));
    }
}
