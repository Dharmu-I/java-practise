package com.java.practise.design.Facade;

public class Samsung implements Mobile {
    @Override
    public void model() {
        System.out.println("Samsung galaxy 4");
    }

    @Override
    public void price() {
        System.out.println("Price 40,000/- Rs");
    }
}
