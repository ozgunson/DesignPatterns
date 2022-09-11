package StrategyPatternExample;

public abstract class Character {

    protected IWeaponBehavior weapon;

    public abstract void fight();

    public void setWeapon(IWeaponBehavior w) {
        this.weapon = w;
    }
}
