package KH._5_10;

public class BowType extends Weapon{
    public BowType(String name, int damage) {
        super(name, damage);
    }

//    public BowType(){
//        super("", 0);
//    }

    @Override
    protected String getWeaponUseMessage() {
        return name+"를 사용하여 화살로";
    }
}
