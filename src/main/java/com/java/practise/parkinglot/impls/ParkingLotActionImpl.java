package com.java.practise.parkinglot.impls;

import com.java.practise.parkinglot.actions.*;
import com.java.practise.parkinglot.constants.ParkingLotConstants;
import com.java.practise.parkinglot.gojek.actions.*;
import com.java.practise.parkinglot.entities.Vehicle;
import com.java.practise.parkinglot.exceptions.InvalidSlotException;
import com.java.practise.parkinglot.exceptions.NoEmptySlotException;
import com.java.practise.parkinglot.repos.VehicleRepo;
import com.java.practise.parkinglot.utils.ObjectBuilder;
import lombok.RequiredArgsConstructor;

import javax.inject.Inject;

@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class ParkingLotActionImpl implements ParkingLotAction {

    private final ParkingSlotAction parkingSlotAction = ParkingSlotAction.getParkingSlotActionInstance();
    private final VehicleRepo vehicleRepo = VehicleRepo.getVehicleRepoInstance();
    private final TicketAction ticketAction;

    @Override
    public String initialise(int numberOfParkingSlots) {
        for (int slotNumber = 1; slotNumber <= numberOfParkingSlots; slotNumber++) {
            parkingSlotAction.addParkingSlot(ObjectBuilder.getParkingSlotObject(slotNumber));
        }
        return String.format(ParkingLotConstants.Responses.SUCCESSFUL_SLOT_CREATION, numberOfParkingSlots);
    }

    @Override
    public String parkVehicle(Vehicle vehicle) throws InvalidSlotException {
        try {
            int slotId = parkingSlotAction.getAvailableParkingSlot();
            parkingSlotAction.allocateSlot(slotId);
            vehicleRepo.registerVehicle(slotId, vehicle);
            ticketAction.generateAndTicketToRepo(slotId, vehicle.getNumber());
            return String.format(ParkingLotConstants.Responses.SUCCESSFULLY_VEHICLE_PARKED, slotId);
        } catch (NoEmptySlotException e) {
            return ParkingLotConstants.Responses.NO_EMPTY_PARKING;
        }
    }

    @Override
    public String removeTheVehicleFromSlot(int parkingSlotId) throws InvalidSlotException {
        parkingSlotAction.freeTheSlot(parkingSlotId);
        vehicleRepo.deRegisterVehicle(parkingSlotId);
        return String.format(ParkingLotConstants.Responses.FREE_THE_SLOT, parkingSlotId);
    }
}
