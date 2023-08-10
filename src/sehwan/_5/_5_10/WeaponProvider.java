package sehwan._5._5_10;

import java.util.Map;

public class WeaponProvider {
    public void provideWeaponToMember(Member[] members, Map<String, String[]> weaponList) {
        WeaponInfo wi;
        String[] weaponInfo;

        for(int i = 0; i < members.length; i++){
            weaponInfo = weaponList.get(members[i].getName());
            wi = new WeaponInfo(weaponInfo[1], Integer.parseInt(weaponInfo[2]), weaponInfo[0]);

            members[i].setWeapon(wi);
        }


    }
}
