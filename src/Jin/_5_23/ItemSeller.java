package Jin._5_23;

public class ItemSeller {
    public static void sell(Member member, String s) {
        String[] itemList = s.split(",");
        for (String item : itemList) {
            if (member.payMoney(ItemList.itemPriceList.get(item), item)) {
                member.addItem(new Item(item, ItemList.itemPriceList.get(item)));
            }
        }
    }
}
