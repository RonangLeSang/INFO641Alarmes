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
        return "Alarme type gaz niveau d'importance : " + getImportanceLevel();
    }

    public String displayDetails(){
        return "Alarme type gaz niveau d'importance : " + getImportanceLevel() + "\nType de gaz : " + getGazType() + "\nDate de l'alarme :" + getDate() + "\nBatiment : " + getLocalisation().getName() ;
    }



}
