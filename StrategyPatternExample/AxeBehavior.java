package StrategyPatternExample;

public class AxeBehavior implements IWeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Chopping enemy");
    }
}
