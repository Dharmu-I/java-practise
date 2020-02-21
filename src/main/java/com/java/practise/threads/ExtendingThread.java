package com.java.practise.threads;

public class ExtendingThread extends Thread {

    public void run(){
        for (int i=0;i<10;i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("In run method : "+this.getName());
        }
    }

    public static void main(String[] args) {
        ExtendingThread extendingThread = new ExtendingThread();
        extendingThread.setName("Thread 1");
        extendingThread.start();
        ExtendingThread extendingThread1 = new ExtendingThread();
        extendingThread1.setName("Thread 2");
        extendingThread1.start();
    }
}
