package com.java.practise.parkinglot.repos;

import com.java.practise.parkinglot.entities.Vehicle;
import com.java.practise.parkinglot.exceptions.InvalidSlotException;
import com.java.practise.parkinglot.utils.ObjectUtils;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class VehicleRepo {

    private static VehicleRepo vehicleRepo;
    private final Map<Integer, Vehicle> vehiclesInParkingSlot;

    private VehicleRepo() {
        this.vehiclesInParkingSlot = new HashMap<>();
    }

    public static VehicleRepo getVehicleRepoInstance() {
        if (ObjectUtils.isNullObject(vehicleRepo)) {
            vehicleRepo = new VehicleRepo();
        }
        return vehicleRepo;
    }

    public void registerVehicle(int slotId, Vehicle vehicle) throws InvalidSlotException {
        if (ObjectUtils.isNullObject(this.vehiclesInParkingSlot.get(slotId))) {
            this.vehiclesInParkingSlot.put(slotId, vehicle);
            return;
        }
        throw new InvalidSlotException("Slot already has vehicle");
    }

    public void deRegisterVehicle(int slotId) throws InvalidSlotException {
        if (ObjectUtils.isNullObject(this.vehiclesInParkingSlot.get(slotId))) {
            throw new InvalidSlotException("Slot don't have vehicle");
        }
        this.vehiclesInParkingSlot.remove(slotId);
    }

    public void resetVehiclesInParkingSlot(){
        this.vehiclesInParkingSlot.clear();
    }
}
