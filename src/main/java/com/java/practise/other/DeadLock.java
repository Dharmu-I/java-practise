package com.java.practise.other;

public class DeadLock {

    public static void method1(){
        synchronized (Integer.class){
            System.out.println("Integer lock method 1");
            synchronized (String.class){
                System.out.println("String lock method 1");
            }
        }
    }

    public static void method2(){
        synchronized (String.class) {
            System.out.println("String lock method 2");

            synchronized (Integer.class) {
                System.out.println("Integer lock method 2");
            }
        }
    }
}
