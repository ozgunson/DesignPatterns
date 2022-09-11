package StrategyPattern;

public class Duck {

    private IQuackBehavior iQuackBehavior;
    private IFlyingBehavior iFlyingBehavior;

    public Duck(IQuackBehavior iQuackBehavior, IFlyingBehavior iFlyingBehavior) {
        this.iFlyingBehavior = iFlyingBehavior;
        this.iQuackBehavior = iQuackBehavior;
    }

    public void flyStrategy () {
        iFlyingBehavior.fly();
    }

    public void quackStrategy () {
        iQuackBehavior.quack();
    }
}
