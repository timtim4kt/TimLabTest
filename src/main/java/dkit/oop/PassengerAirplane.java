package dkit.oop;

import java.util.ArrayList;
import java.util.List;

import static dkit.oop.AirplaneManager.airplaneList;

public class PassengerAirplane extends Airplane  {

    // fields(Q2)
    private int MAX_NUM_PASSENGERS;
    private static ArrayList<String> passengerList;


    PassengerAirplane(String type, int maxNumPassengers) {
       super(type);
       this.passengerList = new ArrayList<>();
       this.MAX_NUM_PASSENGERS = maxNumPassengers;
    }

    @Override
    public String toString() {
        return super.toString() + "Passenger list=" + passengerList + "Max number of passengers=" + MAX_NUM_PASSENGERS;
    }

    public void addPassenger(String name) {
         passengerList.add(name);
    }

    public static Boolean addPassengerNameToAirplane(int airplaneId,String passengerName)
    {
        boolean action = false;
        Airplane a = AirplaneManager.findAirPlaneById(airplaneId);
        if(AirplaneManager.containsAirPlane(a) == true)
        {

            if(a instanceof PassengerAirplane)
            {
                passengerList.add(passengerName);
                action = true;
            }

        }

        return action;
    }

    /*public Airplane findByPassengerName(String passengerName)
    {
        for(Airplane a: airplaneList){
            if(passengerName.equalsIgnoreCase(passengerList);
        }
    }*/



} // end of PassengerAirplane
