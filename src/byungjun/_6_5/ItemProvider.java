package byungjun._6_5;

import java.util.ArrayList;

public class ItemProvider {

    private final ItemRepository itemRepository = ItemRepository.getInstance();

    public Playable getToPlayableByMember(
        Member member, String itemList) throws NotTakeWeaponException {
        String[] splitItemList = itemList.split(",");

        Playable playable = new Player(member);
        ArrayList<Item> items = new ArrayList<Item>();
        for (String itemName : splitItemList) {
            items.add(itemRepository.getItemByItemName(itemName));
        }

        playable.addAllItems(items);
        if (!playable.checkWeapon()) {
            throw new NotTakeWeaponException();
        }
        return playable;
    }

}
