package KH._5_16;

import java.util.Map;
import java.util.Objects;

public class ItemProvider {
    public void provideItem(Member[] members, Map<String, String> map){
        for(Member member : members){
            for(Map.Entry<String, String> entry : map.entrySet()){
                String[] pName = entry.getValue().split(",");
                if(member.getName().equals(entry.getKey()) ){
//                    System.out.print(member.getName()+" : ");
//                    System.out.print(entry.getKey()+" / ");
//                    System.out.println(pName[0].charAt(0));
                    for(int i = 0; i < pName.length; i++){
//                        System.out.println(pName[i].substring(0,1));
                        if(pName[i].substring(0,1).equals("H")){
                            Item item1 = new HpPotion(pName[i].split(":")[0],Integer.parseInt(pName[i].split(":")[1]));
                            member.addItem(item1);
                        }
                        else if(pName[i].substring(0,1).equals("M")){
                            Item item2 = new MpPotion(pName[i].split(":")[0],Integer.parseInt(pName[i].split(":")[1]));
                            member.addItem(item2);
                        }
                    }

                }

            }
            member.allItemUse();
        }

    }
}
