package src;

import Events.BioHazardEvent;
import Events.FireEvent;
import Events.GazEvent;
 import Events.RadiationEvent;

import java.util.ArrayList;

public abstract class Monitor {
    protected ArrayList<BioHazardEvent> listEvent;

    public Monitor(){
        this.listEvent = new ArrayList<BioHazardEvent>();
    }

    public ArrayList<BioHazardEvent> getListEvent() {
        return listEvent;
    }

    public void addEvent(BioHazardEvent bioHazardEvent){
        this.listEvent.add(bioHazardEvent);
    }

    public abstract void  manageFire(FireEvent fireEvent);
    public abstract void  manageGaz(GazEvent gazEvent);

}
