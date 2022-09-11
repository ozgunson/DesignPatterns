package StrategyPattern;

public class LightningFlying implements IFlyingBehavior{
    @Override
    public void fly() {
        System.out.println("I am flying like a lightning");
    }
}
