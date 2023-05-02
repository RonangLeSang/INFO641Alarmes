package src;

import Events.BioHazardEvent;
import Events.FireEvent;
import Events.GazEvent;

import java.util.ArrayList;
import java.util.Date;

public class MonitorA extends Monitor implements FireListener, GazListener{//gère les gaz et les feux



    public MonitorA() {
        super();

    }


    @Override
    public void manageFire(FireEvent fireEvent) {
        this.listEvent.add(fireEvent);
    }

    @Override
    public void manageGaz(GazEvent gazEvent) {
        this.listEvent.add(gazEvent);
    }

    public ArrayList<BioHazardEvent> getListeEvent(){
        return this.listEvent;
    }
}
