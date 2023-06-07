package byungjun._5._5_24;

import java.util.ArrayList;

public class Player implements Playable {
    private Member member;
    private ArrayList<Item> items;

    public Player (Member member) {
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
        StringBuilder sb = new StringBuilder();
        sb.append(member.getName()).append("의 아이템은 :");
        for (Item item : items) {
            sb.append(item).append(", ");
        }
        if (sb.toString().contains(",")) {
            sb.deleteCharAt(sb.lastIndexOf(","));
        }

        System.out.println(sb.toString());
    }
}
