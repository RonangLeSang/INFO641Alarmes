import Events.BioHazardEvent;

public interface MonitorListener {

    public void hazardReception(BioHazardEvent bioHazard);
    public BioHazardEvent newBioHazardEvent();

}
