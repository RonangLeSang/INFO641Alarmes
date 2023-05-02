import src.Building;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Salut");

        ArrayList<Building> buildingsList = new ArrayList<Building>();
        buildingsList.add(new Building("bat A"));
        buildingsList.add(new Building("bat B"));
        buildingsList.add(new Building("bat C"));
        buildingsList.add(new Building("bat D"));
        buildingsList.add(new Building("bat E"));
        buildingsList.add(new Building("bat 7"));
        GenerateHazardModel model = new GenerateHazardModel(buildingsList);
        GenerateHazardWindow window = new GenerateHazardWindow(model);

    }
}
