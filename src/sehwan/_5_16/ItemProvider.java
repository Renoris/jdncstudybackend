package sehwan._5_16;

import java.util.Map;

public class ItemProvider {
    public void provideItem(Member[] members, Map<String, String> map) {
        String[] itemList;
        String[] itemInfo;

        for(int i = 0; i < members.length; i++) {
            if(map.containsKey(members[i].getName())) {
                itemList = map.get(members[i].getName()).split(",");

                for(int j = 0; j < itemList.length; j++) {
                    itemInfo = itemList[j].split(":");
                    members[i].addItem(new Item(itemInfo[0]));
                }
            }

            members[i].allItemUse();
        }
    }
}
