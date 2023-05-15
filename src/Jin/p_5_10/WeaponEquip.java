package Jin.p_5_10;
public class WeaponEquip extends Weapon{
    public enum Equip{
        sword("을 휘둘러"),
        gun("으로 총알을 발사하여"),
        bow("를 사용하여 화살로"),
        glove("으로 주먹을 휘둘러");

        private final String value;

        Equip(String value) {
            this.value = value;
        }

        public String getLabel() {
            return this.value;
        }
    }

    private String tp;

    public WeaponEquip(String name, int damage,String tp ) {
        super(name, damage);
        this.tp =tp;
    }

    @Override
    protected String getWeaponUseMessage() {
        String x;
        try {
            Equip equip = Equip.valueOf(tp);
            x = equip.getLabel();
        } catch (IllegalArgumentException e) {
            x = "을 사용하여";
        }
        return name + x;
    }
}
