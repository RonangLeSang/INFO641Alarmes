package Events;

import java.util.Date;
import src.*;

public class FireEvent extends BioHazardEvent{

    public FireEvent(Object source, Date date, Building localisation, int importanceLevel) {
        super(source, date, localisation, importanceLevel);
    }

    @Override
    public String displayDetails() {
        return "Fire event : -Date : "
                + this.getDate() +
                "  -Localisation : " + this.getLocalisation() + "\n" +
                "  -Importance level : " + this.getImportanceLevel();
    }
}
