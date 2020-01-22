package com.java.practise.array;

public class ReverseSum {

    public static int printNumberReverse(int[] array, int index){
        if (index <= 0 ){
            return 0;
        }
        return array[index] * (int)Math.pow(2, index) + printNumberReverse(array,index-1);
    }

    public static void main(String[] args) {
        int[] array = {0,1,1};
        System.out.println(printNumberReverse(array,array.length-1));
    }
}
