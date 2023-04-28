import java.util.Date;

public class FireEvent extends BioHazardEvent{

    public FireEvent(Object source, Date date, Building localisation, int importanceLevel) {
        super(source, "fire", date, localisation, importanceLevel);
    }
}
