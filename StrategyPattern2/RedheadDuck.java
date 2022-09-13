package StrategyPattern2;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        this.iQuackBehavior = new Squeak();
        this.iFlyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("This is a Redhead Duck");
        this.performQuack();
        this.performFly();
    }

}
