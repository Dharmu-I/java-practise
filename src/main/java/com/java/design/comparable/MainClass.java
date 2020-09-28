package com.java.design.comparable;

public class MainClass {
    public static void main(String[] args) {
        Duck duck1 = new Duck(10);
        Duck duck2 = new Duck(11);
        if (duck1.compareTo(duck2) == -1) {
            System.out.println("Duck 2 is bigger");
        } else if (duck1.compareTo(duck2) == 1) {
            System.out.println("Duck 1 is bigger");
        } else {
            System.out.println("Both are equal");
        }
    }
}
