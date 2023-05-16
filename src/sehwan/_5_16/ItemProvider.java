package sehwan._5_16;

import java.util.Map;

public class ItemProvider {
    public void provideItem(Member[] members, Map<String, String> map) {
        String[] itemList;
        String[] itemInfo;
        Item item;

        for(int i = 0; i < members.length; i++) {
            if(map.containsKey(members[i].getName())) {
                itemList = map.get(members[i].getName()).split(",");

                for(int j = 0; j < itemList.length; j++) {
                    itemInfo = itemList[j].split(":");

                    if(itemInfo[0].substring(0, 2).equals("HP")){
                        item = new HpPotion(itemInfo[0], Integer.parseInt(itemInfo[1]));
                    } else {
                        item = new MpPotion(itemInfo[0], Integer.parseInt(itemInfo[1]));
                    }

                    members[i].addItem(item);
                }
            }

            members[i].allItemUse();
        }
    }
}
