package com.java.practise.array;

public class ReverseSignedNumber {

    public int reverse(int x) {
        if (Math.abs(x) < 0){
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int reminder = -1;
        while (Math.abs(x) >= 10){
            reminder = x % 10;
            x = x / 10;
            stringBuilder.append(Math.abs(reminder));
        }
        stringBuilder.append(Math.abs(x));
        try {
            int finalValue = Integer.parseInt(stringBuilder.toString());
            if (x < 0){
                finalValue = finalValue * -1;
            }
            return finalValue;
        }catch (NumberFormatException e){
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new ReverseSignedNumber().reverse(-122));
        System.out.println(new ReverseSignedNumber().reverse(122));
        System.out.println(new ReverseSignedNumber().reverse(0));
        System.out.println(new ReverseSignedNumber().reverse(-1));
        System.out.println(new ReverseSignedNumber().reverse(1534236469));
        System.out.println(new ReverseSignedNumber().reverse(-2147483648));
        System.out.println(new ReverseSignedNumber().reverse(2147483647));
    }
}
