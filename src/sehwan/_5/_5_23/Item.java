package sehwan._5._5_23;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
}
