package src;

import Events.BioHazardEvent;

import java.util.ArrayList;

public abstract class Monitor {
    protected ArrayList<BioHazardEvent> listEvent;

    public Monitor(){
        this.listEvent = new ArrayList<BioHazardEvent>();
    }
}
