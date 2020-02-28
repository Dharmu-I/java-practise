package com.java.practise.threads;

import static com.java.practise.threads.DisplayClass.display;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        synchronized (DisplayClass.class) {
            display();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableImpl());
        Thread t2 = new Thread(new RunnableImpl());
        t1.start();
        t2.start();
    }

}

class DisplayClass {

    public static void display() {
        for (int i = 0; i < 10; i++) {
            System.out.println("In run method " + i);
        }
    }
}
