package sehwan._5_10;

public class WeaponInfo extends Weapon{
    private String category;
    public WeaponInfo(String[] info) {
        super(info[1], Integer.parseInt(info[2]));
        category = info[0];
    }

    @Override
    protected String getWeaponUseMessage() {
        String middle = "";
        if(category.equals("sword")){
            middle = "을 휘둘러";
        } else if(category.equals("gun")) {
            middle = "으로 총알을 발사하여";
        } else if(category.equals("bow")) {
            middle = "를 사용하여 화살로";
        } else if(category.equals("glove")) {
            middle = "으로 주먹을 휘둘러";
        } else {
            middle = "을 사용하여";
        }
        return name+middle;
    }
}
