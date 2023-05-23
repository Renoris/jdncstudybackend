package Jin._5_24;

import java.util.HashMap;
import java.util.Map;

public class ItemRepository {
    private Map<String, Item> memory;

    {
        memory = new HashMap<>();
        memory.put("HpPotion", new Item("빨간약"));
        memory.put("MpPotion", new Item("학식스"));
        memory.put("Axe", new Item("도끼"));
        memory.put("Rifle", new Item("두다다총"));
        memory.put("FireGun", new Item("라이터"));
    }

    public Item getItemByItemName(String name) {
        return memory.get(name);
    }
}
