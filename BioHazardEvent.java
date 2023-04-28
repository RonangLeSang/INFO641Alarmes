import java.util.Date;
import java.util.EventObject;

public abstract class BioHazardEvent extends EventObject {

    String type;
    Date date;
    Building localisation;
    int importanceLevel;

    public BioHazardEvent(Object source, String type, Date date, Building localisation, int importanceLevel) {
        super(source);
        this.type = type;
        this.date = date;
        this.localisation = localisation;
        this.importanceLevel = importanceLevel;
    }

    public String getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }

    public Building getLocalisation() {
        return localisation;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setLocalisation(Building localisation) {
        this.localisation = localisation;
    }
}
