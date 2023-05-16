package Jin._5_17;

public enum ItemType {
    잡동사니,
    HP50_포션,
    MP30_포션,
    일반엘릭서,
    고급엘릭서;

    public static ItemType fromString(String itemName) {
        for (ItemType type : ItemType.values()) {
            if (type.name().equalsIgnoreCase(itemName.replace(" ", "_"))) {
                return type;
            }
        }
        return null;
    }

    public Item createItem(String itemName, int itemValue) {
        switch (this) {
            case 잡동사니:
                return new Item(itemName);
            case HP50_포션:
                return new HpPotion(itemName, itemValue);
            case MP30_포션:
                return new MpPotion(itemName, itemValue);
            case 일반엘릭서:
                return new Elixir(itemName, itemValue);
            case 고급엘릭서:
                return new HeightElixir(itemName, itemValue);
            default:
                return null;
        }
    }
}