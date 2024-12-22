package avaj_launcher;

import avaj_launcher.Coordinates;
// import avaj_launcher.aircraft.Flyable;
import avaj_launcher.aircraft.*;

class AircraftFactory {

    public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
        return new Baloon(1, p_name, p_coordinates);
    }

}