package sehwan._5_10;

import java.util.Map;

public class WeaponProvider {
    public void provideWeaponToMember(Member[] members, Map<String, String[]> weaponList) {
        WeaponEquipped we;
        Weapon weapon;
        String[] weaponInfo;

        for(int i = 0; i < members.length; i++){
            weaponInfo = weaponList.get(members[i].getName());
            weapon = new Weapon(weaponInfo[1], Integer.parseInt(weaponInfo[2]));

            members[i] = new WeaponEquipped(members[i].getName(), members[i].getAge(), weapon);
        }


    }
}
