package KH._5_10;

public class SwordType extends Weapon{
    public SwordType(String name, int damage) {
        super(name, damage);
    }
//    public SwordType(){
//        super("",0);
//    }

    @Override
    protected String getWeaponUseMessage() {
        return name+"을 휘둘러";
    }
}
