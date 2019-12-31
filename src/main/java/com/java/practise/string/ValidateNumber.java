package com.java.practise.string;

public class ValidateNumber {

    public boolean isNumber(String s) {
        try {
            Double.parseDouble(s.trim());
            if (s.toLowerCase().matches(".*[a-df-z].*")){
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        } catch (NumberFormatException e) {
            return Boolean.FALSE;
        }
    }

    public static void main(String[] args) {
        ValidateNumber validateNumber = new ValidateNumber();
        String[] strings = {
                "0", " 0.1 ", "abc", "1 a", "2e10", "-90e3", " 1e", "e3",
                " 6e-1", " 99e2.5 ", "53.5e93", " --6 ", "-+3", "95a54e53", ""," 0. 1 ",
                "959440.94f",
                "84656e656D",
                "078332e437"
            };
        for (String s: strings){
            System.out.println(s+" " + validateNumber.isNumber(s));
        }
    }
}
