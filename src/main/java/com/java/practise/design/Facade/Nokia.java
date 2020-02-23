package com.java.practise.design.Facade;

public class Nokia implements Mobile {
    @Override
    public void model() {
        System.out.println("Nokia 6600");
    }

    @Override
    public void price() {
        System.out.println("Price 20,000/- Rs");
    }
}
