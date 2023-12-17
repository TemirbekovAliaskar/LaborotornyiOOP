package numberSecondLab.starSystem;

public class Planet {

    protected String name;

    public Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                '}';
    }
}
