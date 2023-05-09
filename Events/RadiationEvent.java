package Events;

import java.util.Date;
import src.*;

public class RadiationEvent extends BioHazardEvent{

    private int radiationLevel;

    public RadiationEvent(Object source, int radiationLevel, Date date, Building localisation, int importanceLevel) {
        super(source, date, localisation, importanceLevel);
        this.radiationLevel = radiationLevel;
    }
    public String displayDetails() {
        return "Fire event : \n\t-Radation level : " + this.radiationLevel + "\n" +
                "-Date : "
                + this.getDate() + "\n" +
                "-Localisation : " + this.getLocalisation() + "\n" +
                "-Importance level : " + this.getImportanceLevel();
    }
}
