import Events.BioHazardEvent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetailListener implements ActionListener {

    private JList<BioHazardEvent> eventsList;
    private MonitorWindow monitorWindow;

    public DetailListener(JList<BioHazardEvent> eventsList, MonitorWindow monitorWindow) {
        this.eventsList = eventsList;
        this.monitorWindow = monitorWindow;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        BioHazardEvent event = eventsList.getSelectedValue();
        JDialog d = new JDialog(monitorWindow, "Detail" );
        JLabel l = new JLabel(event.displayDetails());
        d.add(l);
        d.setSize(400,400);
        d.setVisible(true);
        d.setLocationRelativeTo(null);

    }
}
