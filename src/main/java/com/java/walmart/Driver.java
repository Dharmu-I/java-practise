package com.java.walmart;

public class Driver {

    public static void wrapRight(char[] input){
        int index = input.length-1;
        char lastCharacter = input[index];
        while (index >= 1){
            input[index] = input[index-1];
            index--;
        }
        input[0] = lastCharacter;
    }

    public static void main(String[] args) {
        char[] name = {'D','H','A','R','M','A','P','P','A'};
        while (true){
            System.out.println(name);
            wrapRight(name);
        }
    }
}
