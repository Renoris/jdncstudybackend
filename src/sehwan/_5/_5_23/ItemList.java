package sehwan._5._5_23;

import java.util.HashMap;
import java.util.Map;

public class ItemList {
    public static Map<String, Integer> itemPriceList = new HashMap<>();
    public static Map<String, Integer> getItemPriceMap() {
        itemPriceList.put("HpPotion", 300);
        itemPriceList.put("MpPotion", 500);
        return itemPriceList;
    }


    public static void increaseNewItemList(Map<String, Integer> itemList) {
        for (Map.Entry<String, Integer> entry : itemList.entrySet()) {
            getItemPriceMap().put(entry.getKey(), entry.getValue());
        }
    }
}
