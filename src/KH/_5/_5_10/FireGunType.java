package KH._5._5_10;

public class FireGunType extends Weapon{
    public FireGunType(String name, int damage) {
        super(name, damage);
    }

    public FireGunType(){
        super("", 0);
    }

    @Override
    protected String getWeaponUseMessage() {
        return super.getWeaponUseMessage();
    }
}
