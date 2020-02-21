package com.java.practise.other.non;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ParallismExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        Executor executor = Executors.newFixedThreadPool(5);
        CompletableFuture<Void> future = CompletableFuture.runAsync(()->{});
        for (Integer value : values){
            future = CompletableFuture.runAsync(() -> {
                displayNumber(value);
            }, executor);
        }
        future.get();
        System.out.println("End of the file");
    }

    private static void displayNumber(int value) {
        try {
            Thread.sleep(2000L);
            System.out.println("Value is "+value+" time "+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
