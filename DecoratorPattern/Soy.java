package DecoratorPattern;

public class Soy extends AddonDecorator {

    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 4.99;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
