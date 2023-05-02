package src;

import Events.BioHazardEvent;
import Events.GazEvent;
import Events.RadiationEvent;

import java.util.ArrayList;

public class MonitorB extends Monitor implements GazListener, RadiationListener{

    public MonitorB() {
        super();
    }

    public void manageGaz(GazEvent gazEvent) {
        this.listEvent.add(gazEvent);
    }
    public void manageRadiation(RadiationEvent radiationEvent){
        this.listEvent.add(radiationEvent);
    }



}
