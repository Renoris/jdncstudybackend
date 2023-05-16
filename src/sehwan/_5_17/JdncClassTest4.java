package sehwan._5_17;

import java.util.HashMap;
import java.util.Map;

public class JdncClassTest4 {
    public static void main (String[] args) {
        Member[] members = getMemberList();
        Map<String, String> map = getItemMap();
        //문제를 푸실때 이 주석을 해제하여 주세요
        ItemProvider itemProvider = new ItemProvider();
        itemProvider.provideItem(members, map);

        for (int i = 0; i < members.length; i++) {
            members[i].printAllItem();
        }

        for (int i = 0; i < members.length; i++) {
            members[i].firstElixirUse();
        }

        for (int i = 0; i < members.length; i++) {
            members[i].printStatus();
        }
    }

    private static Member[] getMemberList() {
        return new Member[] {
                new Member("Jackie", 70,50),
                new Member("Adriana", 60, 40),
                new Member("Isol", 30, 70)
        };
    }

    //형식
    //아이템이름:회복량 아이템 구분:,
    //엘릭서의 경우 전체 체력의 회복량% - 포션중독 수치- 회복%량의 10%
    private static Map<String, String> getItemMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Jackie", "잡동사니:0,HP50 포션:50,MP30 포션:30,일반엘릭서:30,HP50 포션:50,잡동사니:0");
        map.put("Adriana", "잡동사니:0,HP30 포션:30,고급엘릭서:50,MP30 포션:30");
        map.put("Isol", "HP30 포션:30,잡동사니:0,MP30 포션:30");
        return map;
    }
}