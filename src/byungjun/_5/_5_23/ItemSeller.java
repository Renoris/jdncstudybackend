package byungjun._5._5_23;

import java.util.Map;

public class ItemSeller {

    public static void sell(Member member, String itemList) {
        String[] splitItemList = itemList.split(",");
        Map<String, Integer> map = ItemList.getItemPriceMap();
        for (String itemName : splitItemList) {
            if (map.containsKey(itemName)) {
                int price = map.get(itemName);
                if (member.payMoney(price, itemName)) member.addItem(new Item(itemName, price));
            }

        }

    }

}
