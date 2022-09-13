package StrategyPattern2;

public class Squeak implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeaking");
    }
}
