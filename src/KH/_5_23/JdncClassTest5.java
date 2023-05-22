package KH._5_23;


import java.util.HashMap;
import java.util.Map;

public class JdncClassTest5 {
    public static void main (String[] args) {
        ItemList.increaseNewItemList(getTobeAddedItem());

        Member[] members = getMemberList();
        Map<String, String> buyList = getBuyList();

        for (Member member: members) {
            //문제를 푸실때 이 주석을 해제해 주세요
//            ItemSeller.sell(member, buyList.get(member.getName()));
            member.showMoney();
            member.showItems();
        }
    }

    private static Member[] getMemberList() {
        return new Member[] {
                new Member("Jackie", 10000),
                new Member("Adriana",  7000),
                new Member("Isol",  3000)
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

    /**
     * 추가될 아이템 리스트
     */
    private static Map<String, Integer> getTobeAddedItem() {
        Map<String, Integer> itemPriceList = new HashMap<>();
        itemPriceList.put("Axe", 1000);
        itemPriceList.put("Rifle", 1500);
        itemPriceList.put("FireGun", 1300);
        return itemPriceList;
    }

}