package sehwan._5_17;

public class MpPotion extends Item implements NormalPotion {
    private int value;
    public MpPotion(String name, String value) {
        super(name);
        this.value = Integer.parseInt(value);
    }

    @Override
    public void use(Member member) {

    }
}
