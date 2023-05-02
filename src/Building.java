package src;

import java.util.ArrayList;


public class Building {
    private ArrayList<Sensor> sensorsPresent;
    private String name;

    public Building(String name) {
        this.sensorsPresent = new ArrayList<Sensor>();
        this.name = name;
    }

    public void addSensor(Sensor aSensor){
        /*
        Method that add a sensor into the ArrayList "sensorsPresent"
         */
        this.sensorsPresent.add(aSensor);
    }

    public String getName() {
        return name;
    }
}
