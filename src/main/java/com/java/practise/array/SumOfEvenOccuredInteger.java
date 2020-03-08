package com.java.practise.array;

import java.util.*;

public class SumOfEvenOccuredInteger {

    public static int sumOfNumberOccuredEvenNumberOfTimes(int[] array) {
        Map<Integer, Integer> mapOfValues = new HashMap<>();
        for (int value : array) {
            if (mapOfValues.containsKey(value)) {
                int incrValue = mapOfValues.get(value) + 1;
                mapOfValues.put(value, incrValue);
            } else {
                mapOfValues.put(value, 1);
            }
        }

        int sum = 0;
        for (int key : mapOfValues.keySet()) {
            if (mapOfValues.get(key) % 2 == 0) {
                sum += key;
            }
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        String[] array;
        Scanner s = new Scanner(System.in);
        int arrayLength = Integer.parseInt(s.nextLine());
        if (arrayLength != 0) {
            array = s.nextLine().split(" ");
            int[] intArray = new int[arrayLength];
            for (int i = 0; i < array.length; i++) {
                intArray[i] = Integer.parseInt(array[i]);
            }
            System.out.println(sumOfNumberOccuredEvenNumberOfTimes(intArray));
        } else {
            System.out.println(0);
        }

    }
}
