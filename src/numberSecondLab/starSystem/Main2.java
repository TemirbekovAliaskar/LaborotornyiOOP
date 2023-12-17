package numberSecondLab.starSystem;

public class Main2 {

    public static void main(String[] args) {


        StarSystem starSystem = new StarSystem("Galaxy : ");

        Moon moon = new Moon("Moon");
        Star star = new Star("Sun");
        System.out.println("Name: " + star.getName());
        System.out.println("Name: " + moon.getName());
        Planet planet1 = new Planet("Mercury");
        Planet planet2 = new Planet("Venus");
        Planet planet3 = new Planet("Earth");
        Planet planet4 = new Planet("Mars");
        Planet planet5 = new Planet("Jupiter");
        Planet planet6 = new Planet("Saturn");
        Planet planet7 = new Planet("Uranus");
        Planet planet8 = new Planet("Neptune");

        starSystem.addPlanet(planet1);
        starSystem.addPlanet(planet2);
        starSystem.addPlanet(planet3);
        starSystem.addPlanet(planet4);
        starSystem.addPlanet(planet5);
        starSystem.addPlanet(planet6);
        starSystem.addPlanet(planet7);
        starSystem.addPlanet(planet8);

        System.out.println("Count: " + starSystem.getPlanetCount());
        System.out.println( starSystem.getAll());

    }
}
