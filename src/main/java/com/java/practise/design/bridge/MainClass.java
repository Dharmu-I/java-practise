package com.java.practise.design.bridge;

public class MainClass {
    public static void main(String[] args) {
        Vehicle vehicle = new Bike(new Assemble());
        vehicle.manufacture();
    }
}
