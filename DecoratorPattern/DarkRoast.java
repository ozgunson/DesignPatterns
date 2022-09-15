package DecoratorPattern;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }
    @Override
    public double cost() {
        return 22.99;
    }
}
