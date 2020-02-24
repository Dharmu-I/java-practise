package com.java.practise.parkinglot.entities;

import com.java.practise.parkinglot.enums.VehicleType;

public class Car extends Vehicle {

    public Car(String number, String colour) {
        super(number, colour, VehicleType.CAR);
    }
}
