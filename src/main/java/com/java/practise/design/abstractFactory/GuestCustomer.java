package com.java.practise.design.abstractFactory;

public class GuestCustomer implements Customer {
    @Override
    public void createCustomer() {
        System.out.println("created Guest customer");
    }
}
