package com.java.practise.parkinglot.core;

import com.java.practise.parkinglot.actions.TicketAction;
import com.java.practise.parkinglot.entities.Vehicle;
import com.java.practise.parkinglot.enums.ProgramArgs;
import com.java.practise.parkinglot.enums.VehicleType;
import com.java.practise.parkinglot.exceptions.*;
import com.java.practise.parkinglot.gojek.exceptions.*;
import com.java.practise.parkinglot.impls.ParkingLotActionImpl;
import com.java.practise.parkinglot.utils.ObjectBuilder;

import java.io.*;

public class ParkingLot {

    private final ParkingLotActionImpl parkingLotActionImpl;
    private final OutputContentFormatter outputContentFormatter;

    public ParkingLot() {
        TicketAction ticketAction = new TicketAction();
        this.outputContentFormatter = new OutputContentFormatter();
        this.parkingLotActionImpl = new ParkingLotActionImpl(ticketAction);
    }

    public static void main(String[] args) throws InvalidNumberOfArgumentException, IOException,
            InvalidVehicleTypeException, InvalidCommandException, InvalidSlotException {
        if (args.length < 1) {
            consoleInput();
            return;
        }
        File file = new File(args[0]);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String eachLine;
        boolean shouldExit;
        while ((eachLine = bufferedReader.readLine()) != null) {
            shouldExit = convertInputToValidArgumentsAndRedirect(eachLine);
            if (shouldExit){
                break;
            }
        }
        bufferedReader.close();
    }

    private static void consoleInput() throws IOException, InvalidNumberOfArgumentException,
            InvalidCommandException, InvalidSlotException, InvalidVehicleTypeException {
        boolean shouldExit = Boolean.FALSE;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (!shouldExit){
            String input = reader.readLine();
            shouldExit = convertInputToValidArgumentsAndRedirect(input);
        }
    }

    private static boolean convertInputToValidArgumentsAndRedirect(String input) throws InvalidNumberOfArgumentException,
            InvalidVehicleTypeException, InvalidCommandException, InvalidSlotException {
        String[] arguments = input.split(" ");
        if (arguments.length < 1) {
            throw new InvalidNumberOfArgumentException("Number of arguments is less. Need more than 1 arguments");
        }
        ProgramArgs programArg = ProgramArgs.valueOf(arguments[0]);
        if (ProgramArgs.exit.equals(programArg)) {
            return Boolean.TRUE;
        }
        new ParkingLot().reDirectTheRequest(programArg, arguments);
        return Boolean.FALSE;
    }

    private void reDirectTheRequest(ProgramArgs programArg, String[] args) throws InvalidNumberOfArgumentException,
            InvalidCommandException, InvalidSlotException, InvalidVehicleTypeException {
        validateArguments(args, programArg);
        switch (programArg) {
            case park:
                Vehicle vehicle = ObjectBuilder.getVehicleObject(args[2], args[1], VehicleType.CAR);
                System.out.println(parkingLotActionImpl.parkVehicle(vehicle));
                break;
            case leave:
                System.out.println(parkingLotActionImpl.removeTheVehicleFromSlot(Integer.parseInt(args[1])));
                break;
            case status:
                outputContentFormatter.status();
                break;
            case create_parking_lot:
                System.out.println(parkingLotActionImpl.initialise(Integer.parseInt(args[1])));
                break;
            case slot_numbers_for_cars_with_colour:
                outputContentFormatter.displaySlotsByColourOfVehicle(args[1]);
                break;
            case slot_number_for_registration_number:
                outputContentFormatter.slotNumberByVehicleNumber(args[1]);
                break;
            case registration_numbers_for_cars_with_colour:
                outputContentFormatter.displayVehicleNumberByColourOfVehicle(args[1]);
                break;
            default:
                throw new InvalidCommandException(String.format("Command %s is not a valid command", programArg));

        }
    }

    private void validateArguments(String[] args, ProgramArgs programArgs) throws InvalidNumberOfArgumentException {
        if (args.length < programArgs.getNumberOfArgs()) {
            String exceptionMessage = String.format("Number of argument required %s are %s", programArgs,
                    programArgs.getNumberOfArgs());
            throw new InvalidNumberOfArgumentException(exceptionMessage);
        }
    }
}
