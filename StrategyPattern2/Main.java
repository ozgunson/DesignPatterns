package StrategyPattern2;

public class Main {

    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        Duck duck2 = new RedheadDuck();
        Duck duck3 = new RubberDuck();

        duck1.display();
        duck2.display();
        duck3.display();
    }

}
