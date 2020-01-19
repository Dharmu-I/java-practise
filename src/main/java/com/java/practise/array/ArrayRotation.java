package com.java.practise.array;

import java.util.ArrayList;

public class ArrayRotation {

    static int[] rotateLeft(int[] a, int d) {
        int[] splitArray = new int[d];
        int i = 0;
        for (i = 0; i < a.length; i++){
            if ( i < d) {
                splitArray[i] = a[i];
            }else {
                a[i-d] = a[i];
            }
        }
        int index = 0;
        while (i-d < a.length){
            a[i-d] = splitArray[index];
            i++;
            index++;
        }
        display(a);
        return a;
    }

    static void display(int[] a){
        for (int i=0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println("Before : ");
        display(a);
        System.out.println("After : ");
        rotateLeft(a,2);
    }
}
