package byungjun._5_10;

public class Glove extends Weapon {
    public Glove(String name, int damage) {
        super(name, damage);
    }

    @Override
    protected String getWeaponUseMessage() {
        return name+"으로 주먹을 휘둘러";
    }
}
