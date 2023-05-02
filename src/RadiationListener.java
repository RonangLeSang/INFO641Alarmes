package src;

import Events.RadiationEvent;

import java.util.Date;

public interface RadiationListener {
    public void manageRadiation(RadiationEvent radiationEvent);
}
