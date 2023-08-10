package sehwan._6._6_5;

import java.util.ArrayList;

public class ItemProvider {

    public Playable getToPlayableByMember(Member member, String itemList) {
        ItemRepository ir = ItemRepository.getInstance();

        ArrayList<Item> itmes = new ArrayList<>();
        String[] toArray = itemList.split(",");

        for(String s : toArray) {
            Item i = ir.getItemByItemName(s);
            itmes.add(i);
        }

        Dummy dummy = new Dummy(member);
        dummy.addAllItems(itmes);

        return dummy;
    }

}
