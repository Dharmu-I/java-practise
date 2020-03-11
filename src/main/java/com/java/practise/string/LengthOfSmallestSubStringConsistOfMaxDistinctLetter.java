package com.java.practise.string;

import java.util.HashMap;
import java.util.Map;

public class LengthOfSmallestSubStringConsistOfMaxDistinctLetter {

    private static int getLengthWindow(String s) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (characterIntegerMap.get(currentChar) == null) {
                characterIntegerMap.put(currentChar, 1);
            } else {
                characterIntegerMap.put(currentChar, characterIntegerMap.get(currentChar) + 1);
            }
        }
        int leftIndex = 0;
        int rightIndex = s.length() - 1;
        while (rightIndex - leftIndex >= characterIntegerMap.size()) {
            char leftChar = s.charAt(leftIndex);
            char rightChar = s.charAt(rightIndex);
            if (characterIntegerMap.get(leftChar) > 1) {
                leftIndex++;
                characterIntegerMap.put(leftChar, characterIntegerMap.get(leftChar) - 1);
            } else if (characterIntegerMap.get(rightChar) > 1) {
                rightIndex--;
                characterIntegerMap.put(rightChar, characterIntegerMap.get(rightChar) - 1);
            } else {
                break;
            }
        }
        System.out.println(rightIndex + " : " + leftIndex);
        return rightIndex - leftIndex + 1;
    }

    public static void main(String[] args) {
        String s = "GEEKSGEEKSFOR";
        System.out.println(getLengthWindow(s));
    }

}
