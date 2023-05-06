package src;


import Events.BioHazardEvent;
import Events.FireEvent;
import Events.GazEvent;

import java.util.ArrayList;
import java.util.Date;

public class ControlRoom {

    ArrayList<Monitor> listMonitor = new ArrayList<Monitor>();

    public void addMonitor(Monitor aMonitor) {
        this.listMonitor.add(aMonitor);
    }

    public void manageNewHazard(BioHazardEvent bioHazardEvent) {
        if (bioHazardEvent instanceof GazEvent) {
            for (Monitor monitor : listMonitor) {
                monitor.addEvent(bioHazardEvent);
            }
        } else if (bioHazardEvent instanceof FireEvent) {
            for (Monitor monitor : listMonitor) {
                if (monitor instanceof MonitorA) {
                    monitor.addEvent(bioHazardEvent);
                }
            }
        } else {
            for (Monitor monitor : listMonitor) {
                if (monitor instanceof MonitorB) {
                    monitor.addEvent(bioHazardEvent);
                }
            }
        }

    }
}