package KH._5._5_23;


import java.util.ArrayList;

public class Member {
    private String name;
    private int money;

    private ArrayList<Item> items = new ArrayList<>();

    public Member(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showMoney() {
        System.out.printf("%s의 잔액 %d\n", name, money);
    }
    public void showItems() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("의 아이템은 :");
        for (Item item : items) {
            sb.append(item).append(", ");
        }
        if (sb.toString().contains(",")) {
            sb.deleteCharAt(sb.lastIndexOf(","));
        }

        System.out.println(sb.toString());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public boolean payMoney(int money, String itemName) {
        if (money > this.money) {
            System.out.printf("%s는 잔액이 부족해 %s을 살 수 없습니다.\n", name, itemName);
            return false;
        }
        this.money -= money;
        return true;
    }

}
