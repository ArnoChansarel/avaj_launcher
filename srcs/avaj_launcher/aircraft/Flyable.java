package avaj_launcher.aircraft;

import avaj_launcher.tower.WeatherTower;

public abstract class Flyable {

    WeatherTower weatherTower;

    public abstract void updateConditions();

    public void registerTower(WeatherTower p_tower) {
        this.weatherTower = p_tower;
    }

}

