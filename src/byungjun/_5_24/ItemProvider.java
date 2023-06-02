package byungjun._5_24;

public class ItemProvider {

    private final ItemRepository itemRepository;

    public ItemProvider(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Playable getToPlayableByMember(Member member, String itemList) {
        String[] splitItemList = itemList.split(",");

        Playable playable = new Player(member);
        for (String itemName : splitItemList) {
            playable.addItem(itemRepository.getItemByItemName(itemName));
        }

        return playable;
    }

}
