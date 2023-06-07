package byungjun._5._5_16;

import java.util.Map;

public class ItemProvider {
    public void provideItem (Member[] members, Map<String, String> itemMap) {
        for(Member member:members) {
            String items = itemMap.get(member.getName());
            if (items == null) continue;

            String[] dividedItems = items.split(",");
            for (String dividedItem: dividedItems) {

                String[] itemInfos = dividedItem.split(":");
                if (itemInfos[0].contains("HP")) {
                    member.addItem(new HpPotion(itemInfos[0], Integer.parseInt(itemInfos[1])));
                } else if (itemInfos[0].contains("MP")) {
                    member.addItem(new MpPotion(itemInfos[0], Integer.parseInt(itemInfos[1])));
                }
            }
        }
    }
}
