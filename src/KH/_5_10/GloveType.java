package KH._5_10;

public class GloveType extends Weapon{
    public GloveType(String name, int damage) {
        super(name, damage);
    }

//    public GloveType(){
//        super("",0);
//    }

    @Override
    protected String getWeaponUseMessage() {
        return name+"으로 주먹을 휘둘러";
    }
}
