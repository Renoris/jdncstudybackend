package KH._5._5_10;

public class GunType extends Weapon{
    public GunType(String name, int damage) {
        super(name, damage);
    }

//    public GunType(){
//        super("", 0);
//    }


    @Override
    protected String getWeaponUseMessage() {
        return name+"으로 총알을 발사하여";
    }
}
