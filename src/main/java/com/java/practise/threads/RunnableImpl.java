package com.java.practise.threads;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println("In run method");
        }
    }

    public static void main(String[] args) {
            RunnableImpl runnable = new RunnableImpl();
            runnable.run();
    }
}
