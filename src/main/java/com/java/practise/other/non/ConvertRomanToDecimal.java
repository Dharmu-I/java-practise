package com.java.practise.other.non;

import java.util.HashMap;
import java.util.Map;

public class ConvertRomanToDecimal {
    private static Map<Character, Integer> romanNumbers;

    static {
        romanNumbers = new HashMap<>();
        initialiseRomanNumberMap();
    }

    public static int convertToDecimal(String chars) {
        int[] representedValues = getRepresentedValues(chars);
        int sum = 0;
        int representedSize = representedValues.length;
        for (int i = 0; i < representedSize; i++){
            int currentValues = representedValues[i];
            if (i+1 < representedSize){
                if (currentValues >= representedValues[i+1]){
                    sum += currentValues;
                }else {
                    sum -= currentValues;
                }
            }else {
                if (representedValues[i-1] > currentValues){
                    sum -= currentValues;
                }else {
                    sum += currentValues;
                }

            }
        }
        return sum;
    }

    public static int[] getRepresentedValues(String chars) {
        int[] values = new int[chars.length()];
        for (int i = 0; i < chars.length(); i++){
            values[i] = romanNumbers.get(chars.charAt(i));
        }
        return values;
    }

    public static void initialiseRomanNumberMap() {
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);
    }

    public static void main(String[] args) {
        System.out.println(convertToDecimal("MCMIV"));
    }
}
