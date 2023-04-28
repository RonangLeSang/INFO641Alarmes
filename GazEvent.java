import java.util.Date;

public class GazEvent extends BioHazardEvent{

    String gazType;

    public GazEvent(Object source, String gazType, Date date, Building localisation, int importanceLevel) {
        super(source, "gaz", date, localisation, importanceLevel);
        this.gazType = gazType;
    }

    public String getGazType() {
        return gazType;
    }
}
