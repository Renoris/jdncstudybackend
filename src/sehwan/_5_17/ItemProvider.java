package sehwan._5_17;

import java.util.Map;

public class ItemProvider {
    public void provideItem(Member[] members, Map<String, String> map) {
        Classification classification = new Classification();
        String[] itemList;
        String[] itemInfo;

        for(Member m : members) {
            itemList = map.get(m.getName()).split(",");

            for(String s : itemList) {
                itemInfo = s.split(":");

                Item item = classification.itemClassification(itemInfo);
                m.addItem(item);
            }
        }
    }
}
