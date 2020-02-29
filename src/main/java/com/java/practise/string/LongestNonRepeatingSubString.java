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

    public static void main(String[] args) {

        System.out.println(new LongestNonRepeatingSubString().lengthOfLongestSubstring("abcabcbb"));
    }
}
