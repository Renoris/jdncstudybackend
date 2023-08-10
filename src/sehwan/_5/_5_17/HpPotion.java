package sehwan._5._5_17;

public class HpPotion extends Item implements NormalPotion {
    private int value;
    public HpPotion(String name, String value) {
        super(name);
        this.value = Integer.parseInt(value);
    }

    @Override
    public void use(Member member) {

    }
}
