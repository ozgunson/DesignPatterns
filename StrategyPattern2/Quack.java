package StrategyPattern2;

public class Quack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacking");
    }
}
