package src;

import Events.FireEvent;

import java.util.Date;


public class Sensor {
    private String name;
    private Building building;

    public Sensor(String name, Building building) {
        this.name = name;
        this.building = building;
    }


    public FireEvent generateFireHazard(Date date, Building localisation, int importanceLevel){
        /*
        method that will generate a fire hazard event
         */
        return new FireEvent(this, date, localisation, importanceLevel );

    }
}
