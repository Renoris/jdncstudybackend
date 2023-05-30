package byungjun._5_24;

public class ObjectFactory {
    private static ItemRepository itemRepositoryInstance;
    private static ItemProvider itemSellerInstance;

    public ItemRepository itemRepository () {
        if (itemRepositoryInstance == null) {
            itemRepositoryInstance = new ItemRepository();
        }
        return itemRepositoryInstance;
    }

    public ItemProvider itemProvider (ItemRepository itemRepository) {
        if (itemSellerInstance == null) {
            itemSellerInstance = new ItemProvider(itemRepository);
        }
        return itemSellerInstance;
    }

    public ItemProvider getItemProvider () {
        ItemRepository itemRepository = itemRepository();
        return itemProvider(itemRepository);
    }
}
