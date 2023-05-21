package sehwan._5_23;

public class ItemSeller {
    public static void sell(Member member, String s) {
        String[] itemList = s.split(",");

        for(int i = 0; i < itemList.length; i++) {
            if(member.payMoney(ItemList.itemPriceList.get(itemList[i]), itemList[i])) {
                member.addItem(new Item(itemList[i], ItemList.itemPriceList.get(itemList[i])));
            };
        }
    }
}
