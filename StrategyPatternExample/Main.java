package StrategyPatternExample;

public class Main {

    public static void main(String[] args) {
        King king = new King(new SwordBehavior());
        king.fight();
        Character troll = new Troll(new AxeBehavior());
        troll.weapon.useWeapon();
    }
}
