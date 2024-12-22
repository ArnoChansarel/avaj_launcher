package avaj_launcher;

import avaj_launcher.aircraft.JetPlane;
import avaj_launcher.Coordinates;


class Simulation {

    public static void main(String[] args) {

        // Coordinates coor = new Coordinates(12, 98, 67);

        JetPlane jetplane = new JetPlane(1, "testname", new Coordinates(12, 98, 67));
        jetplane.displayName();
    }
}
