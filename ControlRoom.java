import Events.BioHazardEvent;
import Events.FireEvent;
import Events.GazEvent;
import src.Building;

import java.util.ArrayList;

public class ControlRoom {

    ArrayList<Monitor> listMonitor;
    ArrayList<Building> listBuildings;

    public ControlRoom(ArrayList<Monitor> listMonitor, ArrayList<Building> listBuildings) {
        this.listMonitor = listMonitor;
        this.listBuildings = listBuildings;
    }

    public void addMonitor(Monitor aMonitor) {
        this.listMonitor.add(aMonitor);
    }

    public void manageNewHazard(BioHazardEvent bioHazardEvent) {
        /** ajoute aux moniteurs concernés les alarmes */
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

    public ArrayList<Monitor> getListMonitor() {
        return listMonitor;
    }

    public ArrayList<Building> getListBuildings() {
        return listBuildings;
    }
}