package com.java.design.adapter;

public class MallarDuck implements Duck {

    @Override
    public void fly() {
        System.out.println("Mallar duck is flying");
    }

    @Override
    public void quack() {
        System.out.println("Mallar duck does quack quack");
    }
}
