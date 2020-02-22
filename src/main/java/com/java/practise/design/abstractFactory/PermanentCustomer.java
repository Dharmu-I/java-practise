package com.java.practise.design.abstractFactory;

public class PermanentCustomer implements Customer {
    @Override
    public void createCustomer() {
        System.out.println("Created the Permanent customer");
    }
}
