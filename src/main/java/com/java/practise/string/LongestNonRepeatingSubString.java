package com.java.practise.string;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatingSubString {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int maxUniqueLength = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (checkUniqueChars(i, j, s)) {
                    if (j - i > maxUniqueLength) {
                        maxUniqueLength = j - i;
                    }
                } else {
                    break;
                }
            }
        }
        return maxUniqueLength + 1;
    }

    public boolean checkUniqueChars(int i, int j, String s) {
        Map<Character, Integer> chars = new HashMap<>();
        while (i <= j) {
            if (chars.containsKey(s.charAt(i))) {
                return false;
            } else {
                chars.put(s.charAt(i), 1);
            }
            i++;
        }
        return true;
    }

    public int approachNew(String s){
        int i = 0;
        int j = 1;
        int maxLength = 0;
        if (s.length() == 0){
            return 0;
        }else if (s.length() == 1){
            return 1;
        }

        while (i < s.length() && j < s.length()){
            if (checkUniqueChars(i, j, s)){
                if (Math.abs(i-j) > maxLength) {
                    maxLength = Math.abs(i - j);
                }
                j++;
            }else {
                if (i < j) {
                    i++;
                }else {
                    j++;
                }
            }
        }
        return maxLength+1;
    }

    public static void main(String[] args) {

        System.out.println(new LongestNonRepeatingSubString().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new LongestNonRepeatingSubString().approachNew("abcabcbb"));
        System.out.println(new LongestNonRepeatingSubString().approachNew(""));
        System.out.println(new LongestNonRepeatingSubString().approachNew(" "));
        System.out.println(new LongestNonRepeatingSubString().approachNew("pwwkew"));
    }
}
