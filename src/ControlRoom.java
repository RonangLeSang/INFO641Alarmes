package src;


import Events.BioHazardEvent;
import Events.FireEvent;
import Events.GazEvent;

import java.util.ArrayList;
import java.util.Date;

public class ControlRoom {

    ArrayList<Monitor> listMonitor = new ArrayList<Monitor>();
    ArrayList<Building> listBuildings = new ArrayList<Building>();

    public void addMonitor(Monitor aMonitor) {
        this.listMonitor.add(aMonitor);
    }

    public void newHazard(BioHazardEvent bioHazardEvent) {
        if (bioHazardEvent instanceof GazEvent) {
            for (Monitor monitor : listMonitor) {
                monitor.listEvent.add(bioHazardEvent);
            }
        } else if (bioHazardEvent instanceof FireEvent) {
            for (Monitor monitor : listMonitor) {
                if (monitor instanceof MonitorA) {
                    monitor.listEvent.add(bioHazardEvent);
                }
            }
        } else {
            for (Monitor monitor : listMonitor) {
                if (monitor instanceof MonitorB) {
                    monitor.listEvent.add(bioHazardEvent);
                }
            }
        }

    }

    public ArrayList<Monitor> getListMonitor() {
        return listMonitor;
    }

    public ArrayList<Building> getListBuildings() {
        return listBuildings;
    }
}