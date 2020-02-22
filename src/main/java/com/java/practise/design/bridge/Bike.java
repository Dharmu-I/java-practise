package com.java.practise.design.bridge;

public class Bike extends Vehicle {

    Bike(WorkShop workShop) {
        super(workShop);
    }

    @Override
    public void manufacture() {
        System.out.print("Bike ");
        workShop.work();
    }
}
