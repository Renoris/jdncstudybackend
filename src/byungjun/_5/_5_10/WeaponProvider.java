package byungjun._5._5_10;

import java.util.Map;

public class WeaponProvider {

    public void provideWeaponToMember(Member[] members, Map<String, String[]> weaponList) {
        for (int i = 0; i < members.length; i++) {
            String name = members[i].getName();
            String[] weaponInfo = weaponList.get(name);
            Weapon weapon;

            String itemName = weaponInfo[1];
            int damage = Integer.parseInt(weaponInfo[2]);

            if (weaponInfo[0].equals("glove")) {
                weapon = new Glove(itemName, damage);

            } else if (weaponInfo[0].equals("gun")) {
                weapon = new Gun(itemName, damage);

            } else if (weaponInfo[0].equals("bow")) {
                weapon = new Bow(itemName, damage);

            } else if (weaponInfo[0].equals("sword")) {
                weapon = new Sword(itemName, damage);

            } else {
                weapon = new Weapon(itemName, damage);
            }

            members[i].setWeapon(weapon);
        }
    }
}
