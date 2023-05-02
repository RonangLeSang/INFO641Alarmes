package src;

import Events.FireEvent;
import Events.GazEvent;
import Events.RadiationEvent;

import java.util.Date;


public class Sensor{
    private String name;
    private Building building;

    public Sensor(String name, Building building) {
        this.name = name;
        this.building = building;
    }


    public FireEvent newFireEvent(Date date, Building localisation, int importanceLevel){
        /*
        method that will generate a fire hazard event
         */
        return new FireEvent(this, date, localisation, importanceLevel );

    }

    public GazEvent newGazEvent(String gazType,Date date, Building localisation, int importanceLevel){
        /*
        Method that will generate a new gaz event */
        return new GazEvent(this, gazType, date, localisation, importanceLevel);
    }
    public RadiationEvent newRadiationEvent(int radiationLevel, Date date, Building localisation, int importanceLevel){
        /*
        Method that will generate a new radiation event
        */
        return new RadiationEvent(this, radiationLevel, date, localisation,importanceLevel);
    }


}
