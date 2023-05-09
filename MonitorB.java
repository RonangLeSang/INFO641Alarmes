import Events.FireEvent;
import Events.GazEvent;
import Events.RadiationEvent;
import src.GazListener;
import src.RadiationListener;

public class MonitorB extends Monitor implements GazListener, RadiationListener {

    public MonitorB(MonitorWindow monitorWindow) {
        super(monitorWindow);
    }

    public void manageGaz(GazEvent gazEvent) {
        this.addEvent(gazEvent);

    }
    public void manageRadiation(RadiationEvent radiationEvent){
        this.addEvent(radiationEvent);
    }



}
