package Jin._5_24;


import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;


public class Character implements Playable {
    private Member member;
    private List<Item> items;

    public Character(Member member) {
        this.member = member;
        this.items = new ArrayList<>();
    }


    @Override
    public String getProfile() {
        return member.getProfile();
    }

    @Override
    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public void printAllItems() {
        StringJoiner itemJoiner = new StringJoiner(", ");
        for (Item item : items) itemJoiner.add(item.getName());
        System.out.println(member.getName() + "의 아이템은: " + itemJoiner.toString());
    }
}