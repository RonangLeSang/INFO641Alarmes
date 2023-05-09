import Events.BioHazardEvent;

import javax.swing.*;
import java.awt.*;

public class MonitorWindow extends JFrame {

    private JList<BioHazardEvent> eventsList;
    JScrollPane eventsScrollPane;
    private JButton detailsButton1, detailsButton2;
    private Monitor aMonitor;
    public MonitorWindow(Monitor aMonitor){

        this.aMonitor = aMonitor;

        this.setTitle("Monitor Window");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000, 650);
        this.setLocationRelativeTo(null);


//        FireEvent event1 = new FireEvent("Alarme incendie", new Date(), new Building("Bâtiment A"), 2);
//        FireEvent event2 = new FireEvent("Détecteur de fumée", new Date(), new Building("Bâtiment B"), 1);
//        FireEvent event3 = new FireEvent("Capteur de température", new Date(), new Building("Bâtiment C"), 3);
//        aMonitor.manageFire(event1);
//        aMonitor.manageFire(event2);
//        aMonitor.manageFire(event3);
        BioHazardEvent[] events = aMonitor.getListEvent().toArray(new BioHazardEvent[0]);
        this.eventsList = new JList<>(events);
        eventsScrollPane = new JScrollPane(eventsList);
        eventsScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(eventsScrollPane, BorderLayout.CENTER);


        JButton detailsButton1 = new JButton("Details");
        JButton detailsButton2 = new JButton("Details");

        JPanel detailsPanel = new JPanel();
        detailsPanel.add(detailsButton1);
        detailsPanel.add(detailsButton2);
        add(detailsPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }
    
    public void refresh(){
        remove(eventsScrollPane);
        BioHazardEvent[] events = aMonitor.getListEvent().toArray(new BioHazardEvent[0]);
        eventsScrollPane = new JScrollPane(new JList<>(events));
        add(eventsScrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Monitor aMonitor = new MonitorA();
        new MonitorWindow(aMonitor);
    }
}


