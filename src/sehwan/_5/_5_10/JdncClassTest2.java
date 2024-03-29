package sehwan._5._5_10;


import java.util.HashMap;
import java.util.Map;

public class JdncClassTest2 {
    public static void main (String[] args) {
        Member[] members = getMemberList();
        Map<String, String[]> weaponList = getWeaponMap();

        //문제를 풀때 해당 주석을 제거해주세요.
        WeaponProvider weaponProvider = new WeaponProvider();
        weaponProvider.provideWeaponToMember(members, weaponList);

        for (Member member : members) {
            member.weaponExplain();
        }

    }

    private static Member[] getMemberList() {
        return new Member[] {
                new Member("Jackie", 22),
                new Member("Adriana", 22),
                new Member("Isol", 16),
                new Member("Jan", 25),
                new Member("Aya", 26),
                new Member("Hyejin", 18),
                new Member("Fiora", 24),
                new Member("Nadine", 21),
                new Member("Hyunwoo", 18)
        };
    }

    private static Map<String, String[]> getWeaponMap() {
        Map<String, String[]> map = new HashMap<>();
        map.put("Jackie", new String[] {"sword","레바테인" ,"50"});
        map.put("Adriana", new String[] {"fireGun","화염방사기" ,"30"});
        map.put("Isol", new String[] {"gun","AK47" ,"60"});
        map.put("Jan", new String[] {"glove","주작자문" ,"20"});
        map.put("Aya", new String[] {"gun", "사사성광" ,"80"});
        map.put("Hyejin", new String[] {"bow", "적궁백시" ,"90"});
        map.put("Fiora", new String[] {"sword", "빛의 검" ,"60"});
        map.put("Nadine", new String[] {"bow", "페일노트" ,"50"});
        map.put("Hyunwoo", new String[] {"glove", "천잠장갑" ,"30"});
        return map;
    }
}