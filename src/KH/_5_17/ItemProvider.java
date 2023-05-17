package KH._5_17;

import java.util.Map;

public class ItemProvider {
    public void provideItem(Member[] members, Map<String, String> map){
        for(Map.Entry<String, String> entry : map.entrySet()){
            String[] value = entry.getValue().split(",");
            for(Member member : members){
                if(member.getName().equals(entry.getKey())){
                    for(String values: value){
                        if(values.contains("HP")){
                            Item item = new HpPotion(values.split(":")[0], Integer.parseInt(values.split(":")[1]));
                            member.addItem(item);
                        } else if (values.contains("MP")) {
                            Item item = new MpPotion(values.split(":")[0], Integer.parseInt(values.split(":")[1]));
                            member.addItem(item);
                        } else if (values.contains("잡동사니")) {
                            member.addItem(new Item(values.split(":")[0]));
                        } else if (values.contains("엘릭서")) {
                            Item elixir = new Elixir(values.split(":")[0], Integer.parseInt(values.split(":")[1]));
                            member.addItem(elixir);
                        }
                    }
                   // member.firstElixirUse();
                }
            }
        }
    }
}
