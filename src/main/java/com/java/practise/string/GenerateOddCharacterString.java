package com.java.practise.string;

public class GenerateOddCharacterString {

    public String generateTheString(int n) {
        char char1 = 'p';
        char char2 = 'z';
        StringBuilder finalString = new StringBuilder();
        for (int i = 1; i <= n - 1; i++) {
            finalString.append(char1);
        }

        if (n % 2 == 0) {
            return finalString.append(char2).toString();
        }

        return finalString.append(char1).toString();
    }

    public static void main(String[] args) {
        System.out.println(new GenerateOddCharacterString().generateTheString(4));
    }
}
