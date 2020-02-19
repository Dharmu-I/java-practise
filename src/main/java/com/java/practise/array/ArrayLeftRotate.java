package com.java.practise.array;

import java.util.Arrays;

public class ArrayLeftRotate {

    public int[] leftRotateOfArray(int[] array, int k){
        int[] splitArray = new int[k];
        int i;
        int size = array.length;
        for (i = 0; i < size; i++){
            if ( i < k){
                splitArray[i] = array[i];
            }else {
                array[i-k] = array[i];
            }
        }

        int index = 0;
        while (i - k < size){
            array[i-k] = splitArray[index];
            i++;
            index++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(new ArrayLeftRotate().leftRotateOfArray(array, 4)));
    }
}
