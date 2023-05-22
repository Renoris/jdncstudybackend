package sehwan._5_24;

import java.util.List;

public class PlayalbeCharacter implements Playable {
    private Member member;
    private List<Item> items;
    public PlayalbeCharacter(Member member, List<Item> items) {
        this.member = member;
        this.items = items;
    }

    @Override
    public String getProfile() {
        StringBuffer sf = new StringBuffer();
        String[] memberInfo = member.getProfile().split(" ");
        sf.append("실험체 - " + memberInfo[1].replace(",", "") + " " + memberInfo[2]);
        return sf.toString();
    }

    @Override
    public void addItem(Item item) {
        System.out.println("이 객체는 addItem 메소드를 수행 할 수 없습니다.");
    }

    @Override
    public void printAllItems() {
        StringBuffer sf = new StringBuffer();
        sf.append(member.getName()).append("의 아이템은 :");
        for(int i = 0; i < items.size(); i++) {
            sf.append(items.get(i).getName());
            if(i != items.size() -1 ) sf.append(", ");
        }

        System.out.println(sf.toString());
    }
}
