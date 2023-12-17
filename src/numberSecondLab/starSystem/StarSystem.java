package numberSecondLab.starSystem;

import numberSecondLab.starSystem.Planet;

import java.util.ArrayList;

public class StarSystem extends Planet {

    private String nameSystem;
    private ArrayList<Planet> planets;

    public String getNameSystem() {
        return nameSystem;
    }

    public void setNameSystem(String nameSystem) {
        this.nameSystem = nameSystem;
    }


    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }

    public StarSystem(String name) {
        super(name);
        this.planets = new ArrayList<>();
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public int getPlanetCount() {
        return planets.size();
    }
    public ArrayList<Planet> getAll (){
        return planets;
    }

    @Override
    public String toString() {
        return "StarSystem{" +
                "nameSystem='" + nameSystem + '\'' +
                ", planets=" + planets +
                "} " + super.toString();
    }
}
