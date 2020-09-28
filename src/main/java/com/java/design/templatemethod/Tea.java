package com.java.design.templatemethod;

public class Tea extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Dipping tea bag");
    }
}
