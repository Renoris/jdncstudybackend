package poo._5_10;

import java.util.HashMap;
import java.util.Map;

public class JdncClassTest2 {
    public static void main (String[] args) {
        Member[] members = getMemberList();
        Map<String, String[]> weaponList = getWeaponMap();

        //문제를 풀때 해당 주석을 제거해주세요.
//        WeaponProvider weaponProvider = new WeaponProvider();
//        weaponProvider.provideWeaponToMember(members, weaponList);

        for (Member member : members) {
            member.weaponExplain();
        }

    }

    private static Member[] getMemberList() {
        return new Member[]{
                new Member("Jackie", "레바테인", 50),
                new Member("Adriana", "화염방사기", 30),
                new Member("Isol", "AK47", 60),
                new Member("Jan", "주작자문", 20),
                new Member("Aya", "사사성광", 80),
                new Member("Hyejin", "적궁백시", 90),
                new Member("Fiora", "빛의 검", 60),
                new Member("Nadine", "페일노트", 50),
                new Member("Hyunwoo", "천잠장갑", 30)
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