package byungjun._5_10;

public class Sword extends Weapon {
    public Sword(String name, int damage) {
        super(name, damage);
    }

    @Override
    protected String getWeaponUseMessage() {
        return name+"을 휘둘러";
    }


}
