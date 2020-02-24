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

public class ParkVehicleTest {

    private ParkingLotActionImpl parkingLotActionImpl;
    private Vehicle vehicle;

    @Before
    public void setUp() throws InvalidVehicleTypeException, InvalidSlotException {
        this.parkingLotActionImpl = new ParkingLotActionImpl(new TicketAction());
        freeAllSlots();
        this.vehicle = ObjectBuilder.getVehicleObject("White", "KA-01-1234", VehicleType.CAR);
    }

    private void freeAllSlots(){
        VehicleRepo.getVehicleRepoInstance().resetVehiclesInParkingSlot();
        ParkingSlotAction.getParkingSlotActionInstance().resetParkingSlot();
    }

    // Without parking slot initialise
    @Test
    public void parkVehicleNoInitialise() {
        String message;
        try {
            message = parkingLotActionImpl.parkVehicle(vehicle);
        } catch (InvalidSlotException e) {
            message = e.getMessage();
        }
        assertEquals(message, "Sorry, parking lot is full");
    }

    @Test
    public void parkVehicleWithInitialise() {
        parkingLotActionImpl.initialise(1);
        String message;
        try {
            message = parkingLotActionImpl.parkVehicle(vehicle);
        } catch (InvalidSlotException e) {
            message = e.getMessage();
        }
        assertEquals(message, "Allocated slot number: 1");
    }
}
