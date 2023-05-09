import src.Building;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GenerateHazardWindow extends JFrame{
    private ControlRoom controlRoom;
    private JPanel panel1 = new JPanel();
    private JPanel backPanel = new JPanel();
    private JComboBox comboBoxBuilding = new JComboBox<>();
    private JComboBox comboBoxType = new JComboBox<>();
    private JSpinner spinnerLevel;
    private JTextArea textGazType = new JTextArea(1, 20);
    private JSpinner spinnerRadiationLevel;
    private JLabel labelBuilding = new JLabel("Bâtiment : ");
    private JLabel labelType = new JLabel("Type : ");
    private JLabel labelLevel = new JLabel("niveau d'alerte : ");
    private JLabel labelGazType = new JLabel("type de gaz : ");
    private JLabel labelRadLevel = new JLabel("niveau de radiation : ");
    private JButton createButton = new JButton("créer alarme");

    public GenerateHazardWindow(ControlRoom controlRoom){
        super("créer une alarme");
        this.controlRoom = controlRoom;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane();
        this.add(backPanel);
        backPanel.setLayout(new GridLayout(0,1));
        panel1.setLayout(new GridLayout(0,2));

        SpinnerNumberModel model1 = new SpinnerNumberModel(1, 1, 3, 1);
        this.spinnerLevel = new JSpinner(model1);
        SpinnerNumberModel model2 = new SpinnerNumberModel(50, 1, 100, 1);
        this.spinnerRadiationLevel = new JSpinner(model2);

        ArrayList<String> nameList = getBuildings();
        for(String name : nameList){
            comboBoxBuilding.addItem(name);
        }

        createButton.addActionListener(new CreateButtonListener(controlRoom, comboBoxBuilding, comboBoxType, spinnerLevel, textGazType, spinnerRadiationLevel, controlRoom.getListBuildings()));

        comboBoxType.addItem("feu");
        comboBoxType.addItem("radiations");
        comboBoxType.addItem("gaz");

        panel1.add(labelBuilding);
        panel1.add(comboBoxBuilding);
        panel1.add(labelType);
        panel1.add(comboBoxType);
        panel1.add(labelLevel);
        panel1.add(spinnerLevel);
        panel1.add(labelGazType);
        panel1.add(textGazType);
        panel1.add(labelRadLevel);
        panel1.add(spinnerRadiationLevel);
        backPanel.add(panel1);
        backPanel.add(createButton);

        setSize(720,480);
        setVisible(true);
    }

    private ArrayList<String> getBuildings(){
        ArrayList<Building> buildingsList = controlRoom.getListBuildings();
        ArrayList<String> nameList = new ArrayList<String>();
        for(Building building : buildingsList){
            nameList.add(building.getName());
        }
        return nameList;
    }

    private void selectType(){
        switch(comboBoxType.getSelectedIndex()){
            case 0:
                System.out.println("fire");
                isFire();
                break;
            case 1:
                System.out.println("radiation");
                isRadiation();
                break;
            case 2:
                System.out.println("gaz");
                isGaz();
                break;
        }
    }

    public void isFire(){
    }

    public void isGaz(){
    }

    public void isRadiation(){
    }

}
