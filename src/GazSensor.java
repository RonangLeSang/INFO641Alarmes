package src;

import Events.FireEvent;
import Events.GazEvent;

import java.util.Date;

public class GazSensor extends Sensor{


    public GazSensor(String name, Building building) {
        super(name, building);
    }

    public GazEvent newGazEvent(String gazType, Date date, Building localisation, int importanceLevel){
        /*
        Method that will generate a new gaz event */
        return new GazEvent(this, gazType, date, localisation, importanceLevel);
    }
}
