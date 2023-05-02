import src.Building;

import java.util.ArrayList;

public class GenerateHazardModel {

    private ArrayList<Building> buildingList;

    public GenerateHazardModel() {
        this.buildingList = new ArrayList<Building>();
    }

    public GenerateHazardModel(ArrayList<Building> buildingList) {
        this.buildingList = buildingList;
    }

    public void addBuilding(Building newBuilding){
        this.buildingList.add(newBuilding);
    }

    public ArrayList<Building> getBuildingList() {
        return buildingList;
    }

    public void setBuildingList(ArrayList<Building> buildingList) {
        this.buildingList = buildingList;
    }
}
