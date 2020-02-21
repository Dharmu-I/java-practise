package com.java.practise.other.non;

public class StringRemoveFunction {

    public static String gameWinner(String colors) {
        // Write your code here
        boolean noTwoAdjuscentWithSameColor = true;
        char turnOFColor = 'w';
        StringBuilder ab = new StringBuilder(colors);
        while (noTwoAdjuscentWithSameColor){
            for (int i = 1;i<colors.length()-1;i++){
                if (ab.charAt(i-1)==turnOFColor && ab.charAt(i)==turnOFColor
                        && ab.charAt(i+1)==turnOFColor ){
                    ab.deleteCharAt(i);
                    if (turnOFColor == 'w'){
                        turnOFColor = 'b';
                    }else {
                        turnOFColor = 'w';
                    }
                    break;
                }
            }
            noTwoAdjuscentWithSameColor = false;
        }
        if (turnOFColor == 'w'){
            return "Bob";
        }else {
            return "wendy";
        }
    }

    public static void main(String[] args) {
        gameWinner("wwwbb");
    }
}
