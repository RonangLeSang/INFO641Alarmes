package Events;

import java.util.Date;
import src.*;

public class GazEvent extends BioHazardEvent{

    private String gazType;

    public GazEvent(Object source, String gazType, Date date, Building localisation, int importanceLevel) {
        super(source, date, localisation, importanceLevel);
        this.gazType = gazType;
    }

    public String getGazType() {
        return gazType;
    }

    public String toString() {
        return "Gaz event : \n\t-Type of gaz : " + this.gazType + "\n"  +
                "-Date : "
                + this.getDate() +  "\n"+
                "-Localisation : " + this.getLocalisation() + "\n" +
                "-Importance level : " + this.getImportanceLevel();
    }
}
