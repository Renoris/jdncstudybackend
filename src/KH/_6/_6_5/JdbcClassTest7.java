package KH._6._6_5;


import java.util.HashMap;
import java.util.Map;

public class JdbcClassTest7 {

    public static void main (String[] args) {
        ItemProvider itemProvider = new ItemProvider();
        Map<String, String> buyList = getBuyList();
        Member[] members = getMemberList();

        for (int i = 0; i < members.length; i++) {
            try{
                Dummy dummy = (Dummy) itemProvider.getToPlayableByMember(members[i], buyList.get(members[i].getName()));
                dummy.printAllItems();
            }catch (NotTakeWeaponException e) {
                System.out.println(members[i].getName()+"은 무기를 소지하지 않았습니다!");
            }
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
        map.put("Isol", "HpPotion,MpPotion");
        return map;
    }

}
