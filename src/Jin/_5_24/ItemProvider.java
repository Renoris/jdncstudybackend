package Jin._5_24;

public class ItemProvider {

    private ItemRepository itemRepository;

    public ItemProvider() {
        this.itemRepository = new ItemRepository(); //조회하기위해
    }

    public Playable getToPlayableByMember(Member member, String itemList) {
        Playable playable = new Character(member);
        String[] itemNames = itemList.split(",");

        for (String itemName : itemNames)  playable.addItem(itemRepository.getItemByItemName(itemName));//repository getItemByItemName 메소드를 통해 아이템추가
        return playable;
    }
}