package com.java.practise.array;

import java.util.Scanner;

public class PairWithLeastEnergy {

    public static void pairSum(Long mainValue) {
        Long value1, value2;
        if ((mainValue % 10) == 0) {
            value1 = (mainValue / 10);
            value2 = mainValue - value1;
        } else {

            value1 = mainValue - 10;
            value2 = 10L;
        }
        Long sum1 = 0L;
        while (value1 > 9) {
            sum1 += value1 % 10;
            value1 = value1 / 10;
        }
        Long sum2 = 0L;
        while (value2 > 9) {
            sum2 += value2 % 10;
            value2 = value2 / 10;
        }
        Long finalValue = sum1 + value1 + sum2 + value2;
        System.out.println(finalValue);
    }

    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        Long mainValue = Long.parseLong(s.nextLine());
        pairSum(mainValue);
    }

}
