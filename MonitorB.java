import Events.BioHazardEvent;

import java.util.ArrayList;

public class MonitorB implements MonitorListener{

    private ArrayList<BioHazardEvent> listEvent = new ArrayList<BioHazardEvent>();

    public MonitorB() {
        this.listEvent = new ArrayList<BioHazardEvent>();
    }
    @Override
    public void hazardReception(BioHazardEvent bioHazard) {
        String type = bioHazard.getType();
        switch (type){
            case("fire"):
                System.out.println("erreur, les moniteurs de type B ne peuvent pas gérer les feux");
                break;
            case("radiation"):
                System.out.println("attention aux cancers");
                listEvent.add(bioHazard);
                break;
            case("gaz"):
                System.out.println("Ca puire messire");
                listEvent.add(bioHazard);
                break;
        }
    }

    @Override
    public BioHazardEvent newBioHazardEvent() {
        return null;
    }
}
