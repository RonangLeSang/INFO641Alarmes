import Events.BioHazardEvent;

public class MonitorA implements MonitorListener{//gère les gaz et les feux

    @Override
    public void hazardReception(BioHazardEvent bioHazard) {

    }

    @Override
    public BioHazardEvent newBioHazardEvent() {
        return null;
    }
}
