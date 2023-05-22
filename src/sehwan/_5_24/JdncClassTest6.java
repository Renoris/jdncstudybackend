package sehwan._5_24;


import java.util.HashMap;
import java.util.Map;

public class JdncClassTest6 {
    public static void main (String[] args) {
        ObjectFactory objectFactory = new ObjectFactory();
        ItemProvider itemProvider = objectFactory.getItemProvider();

        Member[] members = getMemberList();

        Map<String, String> buyList = getBuyList();

        Playable playable;
        for (Member member: members) {
            playable = itemProvider.getToPlayableByMember(member, buyList.get(member.getName()));
            System.out.println(playable.getProfile());
            playable.printAllItems();
        }
    }

    private static Member[] getMemberList() {
        return new Member[] {
                new Member("Jackie", 22),
                new Member("Adriana", 22),
                new Member("Isol", 16)
        };

    }

    /**
     * 형식 - 아이템명
     * 구분자 - ,
     */
    private static Map<String, String> getBuyList() {
        Map<String, String> map = new HashMap<>();
        map.put("Jackie", "HpPotion,HpPotion,MpPotion,Axe");
        map.put("Adriana", "FireGun,HpPotion,MpPotion");
        map.put("Isol", "HpPotion,HpPotion,Rifle,HpPotion");
        return map;
    }
}