package src;

import java.util.ArrayList;


public class Building {
    private GazSensor gazSensor;
    private RadiationSensor radiationSensor;
    private FireSensor fireSensor;
    private String name;

    public Building(GazSensor gazSensor, RadiationSensor radiationSensor, FireSensor fireSensor, String name) {
        this.gazSensor = gazSensor;
        this.radiationSensor = radiationSensor;
        this.fireSensor = fireSensor;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public GazSensor getGazSensor() {
        return gazSensor;
    }

    public RadiationSensor getRadiationSensor() {
        return radiationSensor;
    }

    public FireSensor getFireSensor() {
        return fireSensor;
    }
}
