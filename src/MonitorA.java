package src;

import Events.BioHazardEvent;
import Events.FireEvent;
import Events.GazEvent;
import Events.RadiationEvent;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class MonitorA extends Monitor implements FireListener, GazListener{//gère les gaz et les feux



    public MonitorA() {
        super();

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
