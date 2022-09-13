package StrategyPattern2;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.iQuackBehavior = new Quack();
        this.iFlyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("This is a Rubber Duck");
        this.performQuack();
        this.performFly();
    }
}
