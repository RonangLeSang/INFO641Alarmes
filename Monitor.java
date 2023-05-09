import Events.BioHazardEvent;
import Events.FireEvent;
import Events.GazEvent;
 import Events.RadiationEvent;

import javax.swing.*;
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
        showDialog(bioHazardEvent);
    }

    public abstract void  manageFire(FireEvent fireEvent);
    public abstract void  manageGaz(GazEvent gazEvent);

    private void showDialog(BioHazardEvent event) {
        String message = "";

        if (event instanceof FireEvent) {
            message += "Alarme de type feu";
        } else if (event instanceof GazEvent) {
            message += "Alarme de type gaz";
        }
        else if (event instanceof RadiationEvent) {
            message += "Alarme de type radiation";
        }

        JOptionPane.showMessageDialog(this, message, "Détails de l'alarme", JOptionPane.INFORMATION_MESSAGE);
    }



}
