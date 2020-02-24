package com.java.practise.parkinglot.actions;

import com.java.practise.parkinglot.entities.ParkingSlot;
import com.java.practise.parkinglot.exceptions.InvalidSlotException;
import com.java.practise.parkinglot.exceptions.NoEmptySlotException;
import com.java.practise.parkinglot.utils.ObjectUtils;
import lombok.Getter;

import java.util.*;

@Getter
public class ParkingSlotAction {

    private static ParkingSlotAction parkingSlotAction;
    private final List<ParkingSlot> parkingSlots;

    private ParkingSlotAction() {
        this.parkingSlots = new ArrayList<>();
    }

    public static ParkingSlotAction getParkingSlotActionInstance() {
        if (ObjectUtils.isNullObject(parkingSlotAction)) {
            parkingSlotAction = new ParkingSlotAction();
        }
        return parkingSlotAction;
    }

    public void addParkingSlot(ParkingSlot newParkingSlot) {
        this.parkingSlots.add(newParkingSlot);
        //This is for having slots in the priority manner
        this.parkingSlots.sort(Comparator.comparing(ParkingSlot::getId));
    }

    public void resetParkingSlot() {
        this.parkingSlots.clear();
    }

    public int getAvailableParkingSlot() throws NoEmptySlotException {
        for (ParkingSlot parkingSlot : this.parkingSlots) {
            if (parkingSlot.isAvailable()) {
                return parkingSlot.getId();
            }
        }
        throw new NoEmptySlotException("No empty slot available");
    }

    public void allocateSlot(int slotId) throws InvalidSlotException {
        for (ParkingSlot parkingSlot : this.parkingSlots) {
            if (parkingSlot.getId() == slotId) {
                parkingSlot.allocateSlot();
                return;
            }
        }
        throw new InvalidSlotException("Given slot is not found");
    }

    public void freeTheSlot(int slotId) throws InvalidSlotException {
        for (ParkingSlot parkingSlot : this.parkingSlots) {
            if (parkingSlot.getId() == slotId) {
                parkingSlot.freeTheSlot();
                return;
            }
        }
        throw new InvalidSlotException("Given slot is not found");
    }
}
