package StrategyPatternExample;

public class Queen extends Character {
    @Override
    public void fight() {
        System.out.println("The Queen is fighting.");
        weapon.useWeapon();
    }

    public Queen (IWeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
