package StrategyPattern;

public class Main {

    public static void main(String[] args) {

        Duck duck = new Duck(new LoudQuacking(), new LightningFlying());
        duck.flyStrategy();
        duck.quackStrategy();
    }
}
