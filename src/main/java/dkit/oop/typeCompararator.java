package dkit.oop;

import java.util.Comparator;

public class typeCompararator implements Comparator<Airplane> {

    public int compare(Airplane b1, Airplane b2) {
        return b1.getType().compareTo(b2.getType());
    }

}

