package KH._5._5_10;

import java.util.Map;

public class WeaponProvider {
        public void provideWeaponToMember(Member[] members, Map<String, String[]> weaponList){
//            for (String[] values : weaponList.values()) {
//                for (String value : values) {
//                    System.out.print(value + " ");
//                }
//                System.out.println();
//            }
//            for (String[] values : weaponList.values()) {
//                System.out.println(values[1]);
//            }
            //요소 뽑아내기
//            System.out.println(members[1]);
//            for (Map.Entry<String, String[]> entry : weaponList.entrySet()) {
//                String member = entry.getKey();
//                String[] weapon = entry.getValue();
//                System.out.println(member + ": " + weapon[0] + " ");
//
//            }
            for (Member member : members) {
                for (Map.Entry<String, String[]> entry : weaponList.entrySet()) {
                    String[] weapon = entry.getValue();
                    if (member.getName().equals(entry.getKey())) {
//                        System.out.print(member.getName()+" : ");
//                        System.out.println(weapon[0]);
                        if(weapon[0].equals("sword")){
                            Weapon weapon1 = new SwordType(weapon[1],Integer.parseInt(weapon[2]));
                            member.setWeapon(weapon1);
                            break;
                        }
                        if(weapon[0].equals("bow")){
                            Weapon weapon1 = new BowType(weapon[1],Integer.parseInt(weapon[2]));
                            member.setWeapon(weapon1);
                            break;
                        }
                        if(weapon[0].equals("fireGun")){
                            Weapon weapon1 = new FireGunType(weapon[1],Integer.parseInt(weapon[2]));
                            member.setWeapon(weapon1);
                            break;
                        }
                        if(weapon[0].equals("glove")){
                            Weapon weapon1 = new GloveType(weapon[1],Integer.parseInt(weapon[2]));
                            member.setWeapon(weapon1);
                            break;
                        }
                        if(weapon[0].equals("gun")){
                            Weapon weapon1 = new GunType(weapon[1],Integer.parseInt(weapon[2]));
                            member.setWeapon(weapon1);
                            break;
                        }
                        break;
                    }
                }
            }
    }
}
