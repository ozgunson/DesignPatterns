package StrategyPattern;

public class LoudQuacking implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quacking loudly");
    }
}
