package StrategyPattern2;

public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with wings.");
    }
}
