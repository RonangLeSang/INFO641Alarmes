package src;

import Events.BioHazardEvent;
import Events.FireEvent;
import Events.GazEvent;
import Events.RadiationEvent;

import java.util.ArrayList;

public class MonitorB extends Monitor implements GazListener, RadiationListener{

    public MonitorB() {
        super();
    }

    @Override
    public void manageFire(FireEvent fireEvent) {
        this.addEvent(fireEvent);
    }

    public void manageGaz(GazEvent gazEvent) {
        this.addEvent(gazEvent);

    }
    public void manageRadiation(RadiationEvent radiationEvent){
        this.addEvent(radiationEvent);
    }



}
