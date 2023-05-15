package Jin._5_16;

import java.util.Map;

public class ItemProvider {
    public void provideItem(Member[] members, Map<String, String> map) {
        for (Member member : members) {
            String itemListString = map.get(member.getName());
            if (itemListString != null) {
                String[] list = itemListString.split(",");
                for (String item : list) {
                    String[] itemInfo = item.split(":");
                    createItem(itemInfo[0], Integer.parseInt(itemInfo[1]), member);
                }
            }
            member.allItemUse();
        }
    }

    private void createItem(String name, int value, Member member) {
        if (name.startsWith("HP")) member.addItem(new HpPotion(name, value));
        else if (name.startsWith("MP")) member.addItem(new MpPotion(name, value));
    }

}



