package com.java.practise.recursion;

public class MathematicalTable {

    public static void mathTable(int n, int index){
        if (index > 10){
            return;
        }
        System.out.println(n+" * "+index+" = "+n*index);
        mathTable(n, index+1);
    }

    public static void main(String[] args) {
        mathTable(10,1);
    }
}
