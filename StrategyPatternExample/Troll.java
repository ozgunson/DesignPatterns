package StrategyPatternExample;

public class Troll extends Character {

    @Override
    public void fight() {
        System.out.println("The Troll is fighting.");
        weapon.useWeapon();
    }

    public Troll (IWeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
