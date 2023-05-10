package poo._5_10;

public class Weapon {
    protected String name;
    protected String arm;
    protected int damage;


    public Weapon(String name, int damage, String arm) {
        this.name = name;
        this.damage = damage;
        this.arm = arm;

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArm() {
        return arm;
    }

    public void setArm(String arm){this.arm = arm;}

    protected String getWeaponUseMessage() {
        return name+"을 사용하여";
    }

    @Override
    public String toString() {
        return String.format("%s %d의 피해를 줄 수 있습니다.",getWeaponUseMessage(), damage);
    }
}
