package StrategyPatternExample;

public class SwordBehavior implements IWeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Swinging enemy");
    }
}
