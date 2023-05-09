import Events.BioHazardEvent;
import Events.FireEvent;
import Events.GazEvent;
import src.FireListener;
import src.GazListener;

import java.util.ArrayList;

public class MonitorA extends Monitor implements FireListener, GazListener {//gère les gaz et les feux



    public MonitorA(MonitorWindow monitorWindow) {
        super(monitorWindow);

    }


    @Override
     public void manageFire(FireEvent fireEvent) {
        this.addEvent(fireEvent);


    }

    @Override
    public void manageGaz(GazEvent gazEvent) {
        this.addEvent(gazEvent);
    }

    public ArrayList<BioHazardEvent> getListeEvent(){
        return this.listEvent;
    }



}
