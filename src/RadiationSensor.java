package src;

import Events.RadiationEvent;

import java.util.Date;

public class RadiationSensor extends Sensor{
    public RadiationSensor(String name, Building building) {
        super(name, building);
    }
    public RadiationEvent newRadiationEvent(int radiationLevel, Date date, Building localisation, int importanceLevel){
        /*
        Method that will generate a new radiation event
        */
        return new RadiationEvent(this, radiationLevel, date, localisation,importanceLevel);
    }
}
