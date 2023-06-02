package problem._6_5;


import java.util.ArrayList;

public class Dummy extends Playable {

    public Dummy(Member member) {
        super(member);
    }

    @Override
    public String getProfile() {
        return "어떤 프로필도 없습니다.";
    }

    @Override
    public void addAllItems(ArrayList<Item> items) {
        System.out.println("이 객체는 addAllItems 메소드를 수행 할 수 없습니다.");
    }

    @Override
    public boolean checkWeapon() {
        System.out.println("이 객체는 checkWeapon 메소드를 수행 할 수 없습니다.");
        return false;
    }

    @Override
    public void printAllItems() {
        System.out.println("이 객체는 printAllItems 메소드를 수행 할 수 없습니다.");
    }
}
