package com.java.practise.design.bridge;

public abstract class Vehicle {
    WorkShop workShop;
    Vehicle(WorkShop workShop){
        this.workShop = workShop;
    }

    abstract public void manufacture();
}
