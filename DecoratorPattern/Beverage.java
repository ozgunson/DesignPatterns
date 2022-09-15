package DecoratorPattern;

public abstract class Beverage {

    protected String description = "Beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
