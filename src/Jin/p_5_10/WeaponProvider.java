package Jin.p_5_10;


import java.util.Map;

public class WeaponProvider {
        public void provideWeaponToMember(Member[] members, Map<String, String[]> weaponList) {
                for (Member member : members) {
                        String[] weapon = weaponList.get(member.getName());
                        if (weapon != null && weapon.length >= 3) {///3개의값이들어올때만
                                WeaponEquip weaponEquip = new WeaponEquip(weapon[1], Integer.parseInt(weapon[2]), weapon[0]);
                                member.setWeapon(weaponEquip);
                        }
                }
        }
}
