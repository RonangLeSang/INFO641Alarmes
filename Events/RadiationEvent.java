package Events;

import java.util.Date;
import src.*;

public class RadiationEvent extends BioHazardEvent{

    private int radiationLevel;

    public RadiationEvent(Object source, int radiationLevel, Date date, Building localisation, int importanceLevel) {
        super(source, "radiation", date, localisation, importanceLevel);
        this.radiationLevel = radiationLevel;
    }
}