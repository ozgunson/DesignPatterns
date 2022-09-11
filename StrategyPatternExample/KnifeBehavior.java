package StrategyPatternExample;

public class KnifeBehavior implements IWeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Cutting enemy");
    }
}
