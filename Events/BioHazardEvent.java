package Events;

import java.util.Date;
import java.util.EventObject;
import src.*;

public abstract class BioHazardEvent extends EventObject {

    private String type;
    private Date date;
    private Building localisation;
    private int importanceLevel;

    public BioHazardEvent(Object source, Date date, Building localisation, int importanceLevel) {
        super(source);
        this.date = date;
        this.localisation = localisation;
        this.importanceLevel = importanceLevel;
    }

    public abstract String displayDetails();

    public String getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }

    public Building getLocalisation() {
        return localisation;
    }

    public int getImportanceLevel() {
        return importanceLevel;
    }
}
