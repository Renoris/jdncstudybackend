package KH._6._6_5;

import java.util.HashMap;
import java.util.Map;

public class ItemRepository {
    private static ItemRepository instance;

    private ItemRepository () {

    }
    public static ItemRepository getInstance() {
        if (instance == null) {
            instance = new ItemRepository();
        }
        return instance;
    }
    private Map<String, Item> memory;

    {
        memory = new HashMap<>();
        memory.put("HpPotion", new Item("딸기사탕"));
        memory.put("MpPotion", new Item("민초사탕"));
        memory.put("Axe", new Weapon("죽음을 부르는 파멸의 도끼"));
        memory.put("Rifle", new Weapon("모신나강"));
        memory.put("FireGun", new Weapon("드래곤 브레스"));
    }

    public Item getItemByItemName(String name) {
        return memory.get(name);
    }
}
