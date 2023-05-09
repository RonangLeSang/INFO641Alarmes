package Events;

import java.util.Date;
import src.*;

public class FireEvent extends BioHazardEvent{

    public FireEvent(Object source, Date date, Building localisation, int importanceLevel) {
        super(source, date, localisation, importanceLevel);
    }

    public String displayDetails(){
        return "Alarme type feu niveau d'importance : " + getImportanceLevel() + "\n Date de l'alarme : " + getDate() + "\n Batiment : " + getLocalisation().getName();
    }


    @Override
    public String toString() {
        return "Alarme type feu niveau d'importance : " + getImportanceLevel();
    }
}
