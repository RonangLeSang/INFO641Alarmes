import src.Building;
import src.ControlRoom;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Salut");

        ArrayList<Building> buildingsList = new ArrayList<Building>();
        ControlRoom controlRoom = new ControlRoom();
        GenerateHazardWindow window = new GenerateHazardWindow(controlRoom);

    }
}
