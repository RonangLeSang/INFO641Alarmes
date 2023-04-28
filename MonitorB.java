import Events.BioHazardEvent;

public class MonitorB implements MonitorListener{
    @Override
    public void hazardReception(BioHazardEvent bioHazard) {

    }

    @Override
    public BioHazardEvent newBioHazardEvent() {
        return null;
    }
}
