package mx.iteso.decorator;

public abstract class Taco {
    public enum Size {
        mega, regular, mini
    }

    public Size size;
    public String description = "Any Taco";

    public String getDescription() {
        return description;
    }

    public abstract double cost() throws Exception;

}
