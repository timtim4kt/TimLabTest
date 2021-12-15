package dkit.oop;

import java.util.ArrayList;
import java.util.List;

public class PassengerAirplane extends Airplane  {

    // fields(Q2)
    private int MAX_NUM_PASSENGERS;
    private final ArrayList<String> passengerList;


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

    public void addPassengerNameToAirplane(int airplaneId,String passengerName)
    {
        Airplane a = AirplaneManager.findAirPlaneById(airplaneId);
        if(a!=null)
        {

            if(a instanceof PassengerAirplane)
            {
                for(name n: passengerList)
                {
                    if()
                }
                passengerList.add(passengerName);
            }
            else {
                System.out.println("Cannot add passengers to a cargo plane");
            }
        }
        else {
            System.out.println("Airplane of this id doesnt exist");
        }
    }



} // end of PassengerAirplane
