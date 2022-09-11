package StrategyPatternExample;

public class BowAndArrowBehavior implements IWeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Shooting enemy");
    }
}
