import Events.BioHazardEvent;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MonitorWindow extends JFrame {

    private JList<BioHazardEvent> eventsList;
    JScrollPane eventsScrollPane;
    private JButton detailsButton1, detailsButton2;
    public MonitorWindow(){


        this.setTitle("Monitor Window");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000, 650);
        this.setLocationRelativeTo(null);

        BioHazardEvent[] events = {};
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
    
    public void refresh(ArrayList<BioHazardEvent> listEvent) {
        System.out.println("refresh");
        final DefaultListModel model = new DefaultListModel();
        for (BioHazardEvent event : listEvent) {
            model.addElement(event);
        }
        eventsList.setModel(model);
    }
}


