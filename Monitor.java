import Events.BioHazardEvent;
import Events.FireEvent;
import Events.GazEvent;
 import Events.RadiationEvent;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Monitor extends JFrame{
    protected ArrayList<BioHazardEvent> listEvent;
    private MonitorWindow monitorWindow;

    public Monitor(MonitorWindow monitorWindow){
        this.listEvent = new ArrayList<BioHazardEvent>();
        this.monitorWindow = monitorWindow;
    }

    public ArrayList<BioHazardEvent> getListEvent() {
        return listEvent;
    }

    public void addEvent(BioHazardEvent bioHazardEvent){
        this.listEvent.add(bioHazardEvent);
        showDialog(bioHazardEvent);
    }

    private void showDialog(BioHazardEvent event) {
        /** fait apparaitre une fenetre de dialogue indiquant la création d'une fenêtre */
        String message = "";

        if (event instanceof FireEvent) {
            message += "Alarme de type feu";
        } else if (event instanceof GazEvent) {
            message += "Alarme de type gaz";
        }
        else if (event instanceof RadiationEvent) {
            message += "Alarme de type radiation";
        }

        Object[] options = {"OK"};
        int n = JOptionPane.showOptionDialog(monitorWindow, message, "Detail alarme survenu",JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (n == JOptionPane.OK_OPTION){
            monitorWindow.refresh(this.listEvent);
        }
    }



}
