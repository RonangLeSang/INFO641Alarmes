package src;

import Events.FireEvent;
import Events.GazEvent;
import Events.RadiationEvent;

import java.util.Date;


public abstract class Sensor{
    private String name;
    private Building building;



    public Sensor(String name, Building building) {
        this.name = name;
        this.building = building;
    }







}
