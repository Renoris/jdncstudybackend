package byungjun._5_23;

import java.util.HashMap;
import java.util.Map;

public class ItemList {

    private static Map<String, Integer> instance;
    public static Map<String, Integer> getItemPriceMap() {
        if (instance == null) {
            Map<String, Integer> itemPriceList = new HashMap<>();
            itemPriceList.put("HpPotion", 300);
            itemPriceList.put("MpPotion", 500);
            instance = itemPriceList;
        }
        return instance;
    }

    public static void increaseNewItemList(Map<String, Integer> itemList) {
        for (Map.Entry<String, Integer> entry : itemList.entrySet()) {
            getItemPriceMap().put(entry.getKey(), entry.getValue());
        }
    }
}
