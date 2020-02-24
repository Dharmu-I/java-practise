package com.java.practise.parkinglot.entities;

import com.java.practise.parkinglot.enums.VehicleType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Vehicle {

    private String number;

    private String colour;

    private VehicleType vehicleType;
}
