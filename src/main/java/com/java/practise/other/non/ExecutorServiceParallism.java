package com.java.practise.other.non;

import java.util.Stack;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExecutorServiceParallism {

    public static void displayNumber(int number) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(number+"\t"+System.currentTimeMillis());
    }

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        Stack<Integer> integerStack = new Stack<>();
        for (int i=0;i<10;i++){
            integerStack.push(i);
        }
        System.out.println("Load to stack is done");
//        for (int i=0;i<1;i++) {
//            scheduledExecutorService.scheduleAtFixedRate(() -> displayNumber(integerStack.pop()), 1, 1, TimeUnit.SECONDS);
//        }
    }
}
