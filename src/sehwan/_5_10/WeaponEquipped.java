package sehwan._5_10;

public class WeaponEquipped extends Member{
    public WeaponEquipped(String name, int age, Weapon weapon) {
        super(name, age);
        super.setWeapon(weapon);
    }
}
