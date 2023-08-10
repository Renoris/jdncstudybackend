package KH._6._6_5;


import java.util.ArrayList;

public class Dummy extends Playable {

    public Dummy(Member member) {
        super(member);
    }

    @Override
    public String getProfile() {
        return member.getProfile();
    }

    @Override
    public void addAllItems(ArrayList<Item> items) {

    }

    @Override
    public boolean checkWeapon() {
        System.out.println("이 객체는 checkWeapon 메소드를 수행 할 수 없습니다.");
        return false;
    }

    @Override
    public void printAllItems(){
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
