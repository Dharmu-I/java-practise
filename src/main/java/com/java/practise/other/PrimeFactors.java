package com.java.practise.other;

import java.util.ArrayList;
import java.util.List;

/*
    prime factor: [2,3,5]

    Input: [2-10]
    Output: find the list of numbers from the given range which have the max number of prime factors

    2: 2 (1)
    3: 3 (1)
    4: 2 * 2 (2)
    5: 5 (1)
    6: 2 * 3 (2)
    7: (0)
    8: 2 * 2 * 2 (3)
    9 : 3 * 3 (2)
    10: 2 * 5 (2)

    output: 8
*/

public class PrimeFactors {

    public static List<Integer> getMaxOfPrimeFactor(List<Integer> primeFactor,
                                                    int start, int end) {
        int maxNumberOfFactors = 1;
        List<Integer> outputList = new ArrayList<>();
        outputList.add(start);
        while (start <= end) {
            for (int primeFact : primeFactor) {
                int numberOfFactors = 0;
                if (start % primeFact == 0) {
                    int temp = start;
                    while (temp > 0 && temp >= primeFact) {
                        temp = temp / primeFact;
                        numberOfFactors++;
                        if (primeFactor.contains(temp)) {
                            numberOfFactors++;
                            break;
                        }
                    }
                }
                if (numberOfFactors > maxNumberOfFactors) {
                    outputList = new ArrayList<>();
                    outputList.add(start);
                    maxNumberOfFactors = numberOfFactors;
                } else if (numberOfFactors == maxNumberOfFactors && !outputList.contains(start)) {
                    outputList.add(start);
                }
            }
            start++;
        }

        return outputList;
    }

    public static void main(String[] args) {
        List<Integer> primeFactor = new ArrayList<>();
        primeFactor.add(2);
        primeFactor.add(3);
        primeFactor.add(5);
        System.out.println("Output " + getMaxOfPrimeFactor(primeFactor, 2, 6));
    }
}
