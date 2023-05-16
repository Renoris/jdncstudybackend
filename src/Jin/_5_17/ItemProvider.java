package Jin._5_17;

import java.util.Map;

public class ItemProvider {
        public void provideItem(Member[] members, Map<String, String> map) {
            for (Member member : members) {
                String itemListString = map.get(member.getName());
                if (itemListString !=null) {
                    String[] items = itemListString.split(",");
                    for (String item : items) {
                        String[] itemDetails = item.split(":");
                        ItemType itemType = ItemType.fromString(itemDetails[0]);
                        if (itemType != null) {
                            member.addItem(itemType.createItem(itemDetails[0], Integer.parseInt(itemDetails[1])));
                        }
                    }
                }
            }
        }
    }

