import src.Building;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GenerateHazardWindow extends JFrame{
    private GenerateHazardModel model;
    private JPanel panel1 = new JPanel();
    private JComboBox comboBoxBuilding = new JComboBox<>();
    private JComboBox comboBoxType = new JComboBox<>();
    private JSpinner spinnerLevel;
    private JLabel labelBuilding = new JLabel("Bâtiment : ");
    private JLabel labelType = new JLabel("Type : ");
    private JLabel labelLevel = new JLabel("niveau d'alerte : ");

    public GenerateHazardWindow(GenerateHazardModel model){
        super("créer une alarme");
        this.model = model;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.add(panel1, BorderLayout.NORTH);
        panel1.setLayout(new GridLayout(0,4));

        SpinnerNumberModel model1 = new SpinnerNumberModel(1, 1, 3, 1);
        this.spinnerLevel = new JSpinner(model1);

        ArrayList<String> nameList = getBuildings();
        for(String name : nameList){
//            System.out.println(name);
            comboBoxBuilding.addItem(name);
        }

        comboBoxType.addItem("feu");
        comboBoxType.addItem("radiations");
        comboBoxType.addItem("gaz");

        panel1.add(labelBuilding);
        panel1.add(comboBoxBuilding);
        panel1.add(labelType);
        panel1.add(comboBoxType);
        panel1.add(labelLevel);
        panel1.add(spinnerLevel);

        setSize(720,480);
        setVisible(true);
    }

    private ArrayList<String> getBuildings(){
        ArrayList<Building> buildingsList = model.getBuildingList();
        ArrayList<String> nameList = new ArrayList<String>();
        for(Building building : buildingsList){
            nameList.add(building.getName());
        }
        return nameList;
    }

}
