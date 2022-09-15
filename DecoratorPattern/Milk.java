package DecoratorPattern;

public class Milk extends AddonDecorator {

    Beverage beverage;
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 8.99;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
