package com.java.leetcode;

public class NearestPalindrom {

    public static String nearestPalindromic(String n) {
        if (n.length() <= 1 || (n.length() == 2 && n.equals("10"))) {
            return String.valueOf(Integer.parseInt(n) - 1);
        }
        if (n.length() == 2 && n.equals("11")) {
            return "9";
        }
        int i = 0;
        boolean allNine = true;
        boolean palindrome = true;
        int j = n.length() - 1;
        char[] chars = n.toCharArray();
        while (i < j) {
            if (n.charAt(i) != n.charAt(j)) {
                chars[j] = n.charAt(i);
                palindrome = false;
            }
            if (n.charAt(i) != '9' && n.charAt(j) != '9') {
                allNine = false;
            }
            i++;
            j--;
        }
        if (allNine && n.charAt(i) == '9') {
            for (int k = 0; k < chars.length - 1; k++) {
                chars[k] = '0';
            }
            chars[chars.length - 1] = '1';
            return "1" + String.valueOf(chars);
        }
        if (palindrome) {
            int i1 = Integer.parseInt(String.valueOf(chars[i])) - 1;
            chars[i] = (char) (i1 + '0');
        }
        return String.valueOf(chars);
    }

    public static String palindrome(String n) {
        long value = Long.parseLong(n);
        for (long i = 1; ; i++) {
            if (isPalindrome(value - i)) {
                return "" + (value - i);
            }
            if (isPalindrome(value + i)) {
                return "" + (value + i);
            }
        }
    }

    private static boolean isPalindrome(long x) {
        long t = x, rev = 0;
        while (t > 0) {
            rev = 10 * rev + t % 10;
            t /= 10;
        }
        return rev == x;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("1"));
        System.out.println(palindrome("2"));
        System.out.println(palindrome("120"));
        System.out.println(palindrome("999"));
        System.out.println(palindrome("989"));
        System.out.println(palindrome("99"));
        System.out.println(palindrome("88"));
        System.out.println(palindrome("11"));
        System.out.println(palindrome("10"));
        System.out.println(palindrome("101"));
        System.out.println(palindrome("808"));
    }

}
