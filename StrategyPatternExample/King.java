package StrategyPatternExample;

public class King extends Character {

    public King (IWeaponBehavior weapon) {
        this.weapon = weapon;
    }

    @Override
    public void fight() {
        System.out.println("The King is fighting.");
        weapon.useWeapon();
    }
}
