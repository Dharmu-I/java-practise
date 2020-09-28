package com.java.design.templatemethod;

public class Coffee extends CaffeineBeverage {

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    protected void brew() {
        System.out.println("Dipping coffee to filter");
    }
}
