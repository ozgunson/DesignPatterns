package StrategyPattern2;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.iQuackBehavior = new MuteQuack();
        this.iFlyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("This is a Mallard Duck");
        this.performQuack();
        this.performFly();
    }
}
