package sehwan._5_17;

public class Classification {
    Item item;
    public Item itemClassification(String[] itemInfo) {
        if(itemInfo[0].contains("포션")){
            if(itemInfo[0].contains("HP")) {
                item = new HpPotion(itemInfo[0], itemInfo[1]);
            }
            if(itemInfo[0].contains("MP")) {
                item = new MpPotion(itemInfo[0], itemInfo[1]);
            }
        } else if(itemInfo[0].contains("엘릭서")) {
            if(itemInfo[0].contains("일반")) {
                item = new NormalElixir(itemInfo[0], itemInfo[1]);
            }
            if(itemInfo[0].contains("고급")) {
                item = new AdvancedElixir(itemInfo[0], itemInfo[1]);
            }
        } else {
            item = new Item(itemInfo[0]);
        }

        return item;
    }
}
