package sehwan._6._6_5;


import java.util.ArrayList;

public abstract class Playable {
    protected Member member;
    protected ArrayList<Item> items;

    public Playable(Member member) {
        this.member = member;
        items = new ArrayList<>();
    }

    public String getProfile() {
        return member.getProfile();
    }

    public void addAllItems(ArrayList<Item> items) {
        this.items = items;
    }

    public abstract boolean checkWeapon();

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