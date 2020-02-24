package parking;

import com.java.practise.parkinglot.core.ParkingLot;
import com.java.practise.parkinglot.exceptions.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ParkingLotCompleteTest {

    @Test
    public void endToEndTest(){
        String message = "";
        try {
            ParkingLot.main(new String[]{"../../parking_lot/bin/parking_lot file_inputs.txt"});
        } catch (InvalidNumberOfArgumentException | IOException | InvalidVehicleTypeException | InvalidCommandException
                | InvalidSlotException e) {
            message = e.getMessage();
        }
        assertEquals(message,"");
    }
}
