package com.java.practise.parkinglot.utils;

import com.java.practise.parkinglot.entities.*;
import com.java.practise.parkinglot.exceptions.InvalidVehicleTypeException;
import com.java.practise.parkinglot.gojek.entities.*;
import com.java.practise.parkinglot.enums.VehicleType;

public class ObjectBuilder {

    private ObjectBuilder() {
    }

    public static ParkingSlot getParkingSlotObject(int slotId) {
        return ParkingSlot.builder()
                .id(slotId)
                .available(Boolean.TRUE)
                .build();
    }

    public static Vehicle getVehicleObject(String colour, String vehicleNumber, VehicleType vehicleType)
            throws InvalidVehicleTypeException {
        switch (vehicleType) {
            case CAR:
                return Car.builder()
                        .colour(colour)
                        .number(vehicleNumber)
                        .vehicleType(vehicleType)
                        .build();
            default:
                throw new InvalidVehicleTypeException("Vehicle type is not existed");
        }
    }
}
