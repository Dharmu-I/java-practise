package com.java.practise.parkinglot.actions;

import com.java.practise.parkinglot.entities.Vehicle;
import com.java.practise.parkinglot.exceptions.InvalidSlotException;

public interface ParkingLotAction {
    /**
     * <p> Initialise the parking slots and corresponding variables </p>
     *
     * @param numberOfParkingSlots total number of slot in the parking
     */
    String initialise(int numberOfParkingSlots);

    /**
     * <p> Allocate a parking slot for a given vehicle</p>
     *
     * @param vehicle entered the parking
     * @throws InvalidSlotException when slot id is invalid
     */
    String parkVehicle(Vehicle vehicle) throws InvalidSlotException;

    /**
     * <p> Free the parking slot </p>
     *
     * @param parkingSlotId empty the given parking slot
     * @throws InvalidSlotException when slot id is invalid
     */
    String removeTheVehicleFromSlot(int parkingSlotId) throws InvalidSlotException;
}
