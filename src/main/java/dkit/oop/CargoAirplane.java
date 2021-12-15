package dkit.oop;

public class CargoAirplane extends Airplane{

    // fields (ref. Q1)
    private double MAX_LOAD_KILOS;
    private double currentLoad;


    // constructor
    CargoAirplane(String type,double maxLoad) {
        super(type);

        this.MAX_LOAD_KILOS = maxLoad;
    }


    // toString()
    @Override
    public String toString() {
        return super.toString() + "max load= " + MAX_LOAD_KILOS;
    }

} // END of CargoAirplane class.

