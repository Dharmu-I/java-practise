package parking;

import com.java.practise.parkinglot.actions.ParkingSlotAction;
import com.java.practise.parkinglot.actions.TicketAction;
import com.java.practise.parkinglot.entities.Vehicle;
import com.java.practise.parkinglot.enums.VehicleType;
import com.java.practise.parkinglot.exceptions.InvalidSlotException;
import com.java.practise.parkinglot.exceptions.InvalidVehicleTypeException;
import com.java.practise.parkinglot.impls.ParkingLotActionImpl;
import com.java.practise.parkinglot.repos.VehicleRepo;
import com.java.practise.parkinglot.utils.ObjectBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkingLotTest {

    private ParkingLotActionImpl parkingLotActionImpl;
    private Vehicle vehicle;

    @Before
    public void setUp() throws InvalidVehicleTypeException, InvalidSlotException {
        this.parkingLotActionImpl = new ParkingLotActionImpl(new TicketAction());
        freeAllSlots();
        this.vehicle = ObjectBuilder.getVehicleObject("White", "KA-01-1234", VehicleType.CAR);
    }

    private void freeAllSlots() throws InvalidSlotException {
        VehicleRepo.getVehicleRepoInstance().resetVehiclesInParkingSlot();
        ParkingSlotAction.getParkingSlotActionInstance().resetParkingSlot();
    }

    @Test
    public void removeVehicleNoVehicleOnSlot(){
        parkingLotActionImpl.initialise(1);
        String message;
        try {
            message = parkingLotActionImpl.removeTheVehicleFromSlot(1);
        } catch (InvalidSlotException e) {
            message = e.getMessage();
        }
        assertEquals(message, "Slot don't have vehicle");
    }

    @Test
    public void initialiseParkingSlot(){
        String message = parkingLotActionImpl.initialise(1);
        assertEquals(message,"Created a parking lot with 1 slots");
    }

    @Test
    public void removeVehicle() throws InvalidSlotException {
        parkingLotActionImpl.initialise(1);
        parkingLotActionImpl.parkVehicle(vehicle);
        String message;
        try {
            message = parkingLotActionImpl.removeTheVehicleFromSlot(1);
        } catch (InvalidSlotException e) {
            message = e.getMessage();
        }
        assertEquals(message, "Slot number 1 is free");
    }
}
