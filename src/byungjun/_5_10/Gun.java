package byungjun._5_10;

public class Gun extends Weapon {
    public Gun(String name, int damage) {
        super(name, damage);
    }

    @Override
    protected String getWeaponUseMessage() {
        return name+"으로 총알을 발사하여";
    }
}
