package problem._5_24;

import java.util.HashMap;
import java.util.Map;

public class ItemRepository {
    private Map<String, Item> memory;

    {
        memory = new HashMap<>();
        memory.put("HpPotion", new Item("HpPotion"));
        memory.put("MpPotion", new Item("MpPotion"));
        memory.put("Axe", new Item("Axe"));
        memory.put("Rifle", new Item("Rifle"));
        memory.put("FireGun", new Item("FireGun"));
    }

    public Item getItemByItemName(String name) {
        return memory.get(name);
    }
}
