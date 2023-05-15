package JY._5_10;

import java.util.Map;

public class WeaponProvider {
    // Member 배열과 무기 리스트를 받아 멤버들에게 무기를 제공하는 메소드
    public void provideWeaponToMember(Member[] members, Map<String, String[]> weaponList) {
        // 멤버 배열을 반복하면서 각 멤버에게 무기 제공
        for (Member member : members) {
        // for (int i = 0; i < member.length; i++) {
            // Member member = members[i]

            // 멤버의 이름을 가진 키로 가지는 무기 정보를 가져옴
            String[] weaponInfo = weaponList.get(member.getName());

            // 무기 정보가 없으면 다음 멤버로 넘어감
            if (weaponInfo == null) {
                continue;
            }
            // 무기 객체를 생성할 변수 선언
            Weapon weapon;

            // 무기 정보에서 무기 타입, 이름, 데이미를 가져옴
            String weaponType = weaponInfo[0];
            String weaponName = weaponInfo[1];
            int weaponDamage = Integer.parseInt(weaponInfo[2]);

            // 무기 타입에 따라 무기 객체를 생성
            if (weaponType.equals("sword")) {
                weapon = new Sword(weaponName, weaponDamage);
            } else if (weaponType.equals("glove")) {
                weapon = new Glove(weaponName, weaponDamage);
            } else if (weaponType.equals("bow")) {
                weapon = new Bow(weaponName, weaponDamage);
            } else if (weaponType.equals("fireGun")) {
                weapon = new FireGun(weaponName, weaponDamage);
            }else if (weaponType.equals("gun")) {
                weapon = new Gun(weaponName, weaponDamage);
            } else {
                // 무기 타입이 잘못되었으면 다음 멤버로 넘어감
                continue;
            }
            // 멤버에게 무기를 설정
            member.setWeapon(weapon);
        }
    }

    // 내부 클래스로 다양한 무기 타입에 대한 구현을 함
    private static class Sword extends Weapon {
        public Sword(String name, int damage) {
            super(name, damage);
        }

        // protect 키워드는 다른 패키지에서는 접근이 불가능하지만, 다른 패키지의 자식 클래스에서는 접근 가능
        @Override
        protected String getWeaponUseMessage() {
            return name+"을 휘둘러";
        }
    }

    private static class Glove extends Weapon {
        public Glove(String name, int damage) {
            super(name, damage);
        }

        @Override
        protected String getWeaponUseMessage() {
            return name+"으로 주먹을 휘둘러";
        }
    }

    private static class Bow extends Weapon {
        public Bow(String name, int damage) {
            super(name, damage);
        }

        @Override
        protected String getWeaponUseMessage() {
            return name+"를 사용하여 화살로";
        }
    }

    private static class FireGun extends Weapon {
        public FireGun(String name, int damage) {
            super(name, damage);
        }

        @Override
        protected String getWeaponUseMessage() {
            return name+"을 사용하여";
        }
    }

    private static class Gun extends Weapon {
        public Gun(String name, int damage) {
            super(name, damage);
        }

        @Override
        protected String getWeaponUseMessage() {
            return name+"으로 총알을 발사하여";
        }
    }
}
