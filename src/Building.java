package src;

import java.util.ArrayList;


public class Building {
    private ArrayList<Sensor> sensorsPresent;
    private String nom;

    public Building(String nom) {
        this.sensorsPresent = new ArrayList<Sensor>();
        this.nom = nom;
    }

    public void addSensor(Sensor aSensor){
        /*
        Method that add a sensor into the ArrayList "sensorsPresent"
         */
        this.sensorsPresent.add(aSensor);
    }
}
