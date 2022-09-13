package StrategyPattern2;

public class MuteQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Can't quack");
    }
}
