package byungjun._5._5_10;

public class Bow extends Weapon {
    public Bow(String name, int damage) {
        super(name, damage);
    }

    @Override
    protected String getWeaponUseMessage() {
        return name+"를 사용하여 화살로";
    }
}
