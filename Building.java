import java.util.ArrayList;

public class Building {
    private ArrayList<Sensor> sensorsPresent;

    public Building() {
        this.sensorsPresent = new ArrayList<Sensor>();
    }

    public void addSensor(Sensor aSensor){
        /*
        Method that add a sensor into the ArrayList "sensorsPresent"
         */
        this.sensorsPresent.add(aSensor);
    }
}
