package dkit.oop;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
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

    // write add() method
public void add(Airplane airplane)
{
    airplaneList.add(airplane);
}

    public static void displayAllAirplanes() {
        for (Airplane a : airplaneList)
            System.out.println(a.toString());
    }

    public static void displayAllPassengerAirplanes() {
        for (Airplane a : airplaneList)
        {
            if(a instanceof PassengerAirplane)
            {
                System.out.println(a.toString());
            }
        }

    }

    //  write method getAllCargoAirplanes()
    public static ArrayList<Airplane> getAllCargoAirplanes() {
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
    /*Answer is in PassengerAirplane.Java*/

    // write containsAirplane( Airplane plane )
    public static Boolean containsAirPlane(Airplane airplane)
    {
        boolean exists = false;
        for(Airplane a : airplaneList)
        {
            if(a.equals(airplane))
            {
                exists = true;
            }
        }
        return exists;
    }

    // write findAirplaneByPassengerName( passengerName )
    /*attempt in PassengerAirplane.Java*/

    // write displayAllAirplanesInOrderOfType( argument )
    public static void  displayAllAirplanesInOrderOfType()
    {
        ArrayList<Airplane> list = new ArrayList<>();
        for (Airplane a : airplaneList)
        {
            list.add(a);
        }

        typeCompararator tComparator = new typeCompararator();
        Collections.sort(list, tComparator);

        for(Airplane a : list)
        {
            System.out.println(a.toString());
        }
    }





} // end of AirplaneManager


