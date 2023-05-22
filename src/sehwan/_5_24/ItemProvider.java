package sehwan._5_24;

import java.util.ArrayList;
import java.util.List;

public class ItemProvider {

    public Playable getToPlayableByMember(Member member, String itemList) {
        String[] list = itemList.split(",");
        List<Item> items = new ArrayList<>();

        for(String s : list) {
            items.add(new Item(s));
        }

        return new PlayalbeCharacter(member, items);
    }

}
