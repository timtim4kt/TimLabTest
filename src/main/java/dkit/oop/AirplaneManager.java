package dkit.oop;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * AirplaneManager is a container class that stores Airplanes
 * (of various class types) in a list.
 * It provides a public interface of methods that can
 * be used to manage the planes in the list.
 * It "encapsulates" the logic for managing Airplanes
 * and "hides" the data structures used to store the data.
 */

public class AirplaneManager {

    static ArrayList<Airplane> airplaneList;

    public AirplaneManager() {
        airplaneList = new ArrayList<>();
    }

    //Q3.

    // write add() method
public void add(Airplane airplane)
{
    airplaneList.add(airplane);
}

    public void displayAllAirplanes() {
        for (Airplane a : airplaneList)
            System.out.println(a.toString());
    }

    public void displayAllPassengerAirplanes() {
        for (Airplane a : airplaneList)
        {
            if(a instanceof PassengerAirplane)
            {
                System.out.println(a.toString());
            }
        }

    }

    //  write method getAllCargoAirplanes()
    public ArrayList<Airplane> getAllCargoAirplanes() {
        ArrayList allCargoAirplanes = new ArrayList();
        for (Airplane a : airplaneList)
        {
            if(!(a instanceof PassengerAirplane))
            {
                allCargoAirplanes.add(a);
            }
        }

        return allCargoAirplanes;
    }

    // write  addPassengerNameToAirplane( airplaneId, passengerName)



    // write containsAirplane( Airplane plane )


    // write findAirplaneByPassengerName( passengerName )

    // write displayAllAirplanesInOrderOfType( argument )


    public static Airplane findAirPlaneById(int id)
    {
        for(Airplane a : airplaneList){
            if(a.getId() == id)
            {
                return a;
            }
        }
        return null;
    }

} // end of AirplaneManager


