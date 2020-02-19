package com.java.practise.dynamic_programming;

public class LongestRepetitiveSubString {

    public static int findMaxSubStringSize(String sequence) {
        int maxCount = 1;
        char prevChar = sequence.charAt(0);
        int currentCount = 1;
        for (int i = 1; i < sequence.length(); i++) {
            if (prevChar == sequence.charAt(i)) {
                currentCount++;
            } else {
                maxCount = Math.max(currentCount, maxCount);
                prevChar = sequence.charAt(i);
                currentCount = 1;
            }
        }
        return Math.max(currentCount, maxCount);
    }

    public static void main(String[] args) {
        System.out.println(findMaxSubStringSize("AAAABCDDBBBEAAAAA"));
    }
}
