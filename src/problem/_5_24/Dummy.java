package problem._5_24;

public class Dummy implements Playable{
    @Override
    public String getProfile() {
        return "어떤 프로필도 없습니다.";
    }

    @Override
    public void addItem(Item item) {
        System.out.println("이 객체는 addItem 메소드를 수행 할 수 없습니다.");
    }

    @Override
    public void printAllItems() {
        System.out.println("이 객체는 printAllItems 메소드를 수행 할 수 없습니다.");
    }
}
