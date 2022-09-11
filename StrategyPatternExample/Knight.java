package StrategyPatternExample;

public class Knight extends Character {
    @Override
    public void fight() {
        System.out.println("The Knight is fighting.");
        weapon.useWeapon();
    }

    public Knight (IWeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
