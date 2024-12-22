package avaj_launcher.aircraft;

import avaj_launcher.Coordinates;
import avaj_launcher.aircraft.Flyable;

public class Aircraft extends Flyable {


    protected long          id;
    protected String        name;
    protected Coordinates   coordinates;

    public Aircraft(final long p_id, final String p_name, Coordinates p_coordinates) {
        this.id = p_id;
        this.name = p_name;
        this.coordinates = p_coordinates;
    }

    public void updateConditions() {

    }

    public void displayName() {
        System.out.println("Name is " + this.name);
    }

    String getName() {
        return this.name;
    }

}