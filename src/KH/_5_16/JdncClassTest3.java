
package KH._5_16;

import java.util.HashMap;
import java.util.Map;

public class JdncClassTest3 {
    public static void main (String[] args) {
        Member[] members = getMemberList();
        Map<String, String> map = getItemMap();

//        //이 주석을 해제해서 사용해주세요
        ItemProvider itemProvider = new ItemProvider();
        itemProvider.provideItem(members, map);

        for (Member member : members) {
            member.printStatus();
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

    //형식
    //아이템이름:회복량 아이템 구분:,
    private static Map<String, String> getItemMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Jackie", "HP50 포션:50,MP30 포션:30");
        map.put("Adriana", "HP30 포션:30,MP30 포션:40");
        map.put("Isol", "HP30 포션:30,MP50 포션:50");
        map.put("Nadine", "HP10 포션:10");
        map.put("Hyunwoo", "MP30 포션:30");
        return map;
    }
}