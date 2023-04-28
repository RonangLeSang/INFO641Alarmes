import Events.BioHazardEvent;

import java.util.ArrayList;

public class MonitorA implements MonitorListener{//gère les gaz et les feux

    private ArrayList<BioHazardEvent> listEvent;

    public MonitorA() {
        this.listEvent = new ArrayList<BioHazardEvent>();
    }

    @Override
    public void hazardReception(BioHazardEvent bioHazard) {
        String type = bioHazard.getType();
        switch (type){
            case("fire"):
                System.out.println("il fait chaud, non ?");
                listEvent.add(bioHazard);
                break;
            case("radiation"):
                System.out.println("erreur, les moniteurs de type B ne peuvent pas gérer les feux");
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
