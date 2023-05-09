package Events;

import java.util.Date;
import src.*;

public class RadiationEvent extends BioHazardEvent{

    private int radiationLevel;

    public RadiationEvent(Object source, int radiationLevel, Date date, Building localisation, int importanceLevel) {
        super(source, date, localisation, importanceLevel);
        this.radiationLevel = radiationLevel;
    }
    public String toString() {
        return "Alarme type radiation niveau d'importance : " + getImportanceLevel();
    }

    public String displayDetails(){
        return "Alarme type radiation niveau d'importance : " + getImportanceLevel() + "\n Niveau de radiation : " + radiationLevel +  "\nDate de l'alarme :" + getDate() + "\nBatiment : " + getLocalisation().getName();
    }

}
