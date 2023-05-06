package src;

import Events.FireEvent;

import java.util.Date;

public class FireSensor extends Sensor{

    public FireSensor(String name, Building building) {
        super(name, building);
    }

    public FireEvent newFireEvent(Date date, Building localisation, int importanceLevel){
        /*
        method that will generate a fire hazard event
         */
        return new FireEvent(this, date, localisation, importanceLevel );

    }
}
