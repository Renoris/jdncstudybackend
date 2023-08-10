package KH._5._5_23;

import java.util.Map;

public class ItemSeller {
    public static void sell(Member member, String items){
        if(member.getName().equals("Isol")){
            member.payMoney(800,"벌금");
        }
//        System.out.println(items);
        String[] itemName = items.split(",");
        ItemList list = new ItemList();
        Map<String, Integer> itemPriceMap = list.getItemPriceMap();
        for(String name : itemName){
            for (Map.Entry<String, Integer> entry : itemPriceMap.entrySet()){
                if(name.equals(entry.getKey()) && member.payMoney(entry.getValue(), entry.getKey())){
                    Item item = new Item(entry.getKey(),entry.getValue());
                    member.addItem(item);
                    break;
                }
            }
        }

    }
}
