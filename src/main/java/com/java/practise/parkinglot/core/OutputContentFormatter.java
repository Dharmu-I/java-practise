package com.java.practise.parkinglot.core;

import com.java.practise.parkinglot.constants.ParkingLotConstants;
import com.java.practise.parkinglot.entities.Vehicle;
import com.java.practise.parkinglot.repos.VehicleRepo;
import com.java.practise.parkinglot.utils.ObjectUtils;

import java.util.Map;

public class OutputContentFormatter {

    private final Map<Integer, Vehicle> vehicleMap;

    public OutputContentFormatter() {
        this.vehicleMap = VehicleRepo.getVehicleRepoInstance().getVehiclesInParkingSlot();
    }

    public void displaySlotsByColourOfVehicle(String color) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int slotId : vehicleMap.keySet()) {
            Vehicle vehicle = vehicleMap.get(slotId);
            if (!ObjectUtils.isNullObject(vehicle) && !ObjectUtils.isNullOrEmpty(color)
                    && color.equals(vehicle.getColour())) {
                stringBuilder.append(slotId).append(",").append("\t");
            }
        }
        // -2 is remove last space and comma
        System.out.println(stringBuilder.toString().substring(0, stringBuilder.toString().length() - 2));
    }

    public void slotNumberByVehicleNumber(String vehicleNumber) {
        for (int slotId : vehicleMap.keySet()) {
            Vehicle vehicle = vehicleMap.get(slotId);
            if (!ObjectUtils.isNullObject(vehicle) && !ObjectUtils.isNullOrEmpty(vehicleNumber)
                    && vehicleNumber.equals(vehicle.getNumber())) {
                System.out.println(slotId);
                return;
            }
        }
        System.out.println(ParkingLotConstants.Responses.NOT_FOUND);
    }

    public void displayVehicleNumberByColourOfVehicle(String color) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int slotId : vehicleMap.keySet()) {
            Vehicle vehicle = vehicleMap.get(slotId);
            if (!ObjectUtils.isNullObject(vehicle) && !ObjectUtils.isNullOrEmpty(color)
                    && color.equals(vehicle.getColour())) {
                stringBuilder.append(vehicle.getNumber()).append(",").append("\t");
            }
        }
        // -2 is remove last space and comma
        System.out.println(stringBuilder.toString().substring(0, stringBuilder.toString().length() - 2));
    }

    public void status() {
        StringBuilder content = new StringBuilder();
        content.append("Slot No.").append("\t")
                .append("Registration No").append("\t")
                .append("Colour").append("\n");
        for (int slotId : vehicleMap.keySet()) {
            Vehicle vehicle = vehicleMap.get(slotId);
            if (!ObjectUtils.isNullObject(vehicle)) {
                content.append(slotId).append("\t")
                        .append(vehicle.getNumber()).append("\t")
                        .append(vehicle.getColour()).append("\n");
            }
        }
        if (vehicleMap.size() > 0) {
            System.out.print(content.toString());
        }
    }
}
