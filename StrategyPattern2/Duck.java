package StrategyPattern2;

public abstract class Duck {

    IFlyBehavior iFlyBehavior;
    IQuackBehavior iQuackBehavior;

    public Duck() {
    }

    public Duck(IFlyBehavior iFlyBehavior, IQuackBehavior iQuackBehavior) {
        this.iFlyBehavior = iFlyBehavior;
        this.iQuackBehavior = iQuackBehavior;
    }

    public abstract void display();
    public void swim() {
        System.out.println("Swimming.");
    }

    public void performQuack() {
        iFlyBehavior.fly();
    }
    public void performFly() {
        iQuackBehavior.quack();
    }

    public void setiQuackBehavior(IQuackBehavior quack) {
        iQuackBehavior = quack;
    }

    public void setiFlyBehavior(IFlyBehavior fly) {
        iFlyBehavior = fly;
    }

}
