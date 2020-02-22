package com.java.practise.design.bridge;

public class Assemble implements WorkShop {
    @Override
    public void work() {
        System.out.println("Assembled");
    }
}
