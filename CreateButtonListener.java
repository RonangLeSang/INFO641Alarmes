import src.Building;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public class CreateButtonListener implements ActionListener {

    private JComboBox comboBoxBuilding;
    private JComboBox comboBoxType;
    private JSpinner spinnerLevel;
    private JTextArea textGazType;
    private JSpinner spinnerRadiationLevel;
    private ArrayList<Building> listBuildings;

    public CreateButtonListener(JComboBox comboBoxBuilding, JComboBox comboBoxType, JSpinner spinnerLevel, JTextArea textGazType, JSpinner spinnerRadiationLevel, ArrayList<Building> listBuildings) {
        this.comboBoxBuilding = comboBoxBuilding;
        this.comboBoxType = comboBoxType;
        this.spinnerLevel = spinnerLevel;
        this.textGazType = textGazType;
        this.spinnerRadiationLevel = spinnerRadiationLevel;
        this.listBuildings = listBuildings;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(comboBoxType.getSelectedIndex()){
            case 0:
                System.out.println("fire");
                getBuilding().getFireSensor().generateHazard(new Date(), getBuilding(), spinnerLevel.getValue());
                break;
            case 1:
                System.out.println("radiation");
                getBuilding().getRadiationSensor().generateHazard(new Date(), getBuilding(), spinnerLevel.getValue(), spinnerRadiationLevel.getValue());
                break;
            case 2:
                System.out.println("gaz");
                getBuilding().getGazSensor().generateHazard(new Date(), getBuilding(), spinnerLevel.getValue(), textGazType.getText());
                break;
        }
    }

    public Building getBuilding(){
        for(Building building : listBuildings){
            if(building.getName().equals(comboBoxBuilding.getSelectedItem())){
                return building;
            }
        }
        return null;
    }

}
