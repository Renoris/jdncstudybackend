package KH._5._5_17;

public class MpPotion extends Item implements Potion {

    private int value;

    public MpPotion(String name, int value) {
        super(name);
        this.value = value;
    }
    @Override
    public void use(Member member) {
        member.setMp(member.getMp() + value);
        System.out.printf("%s 님이 %s 아이템을 사용하셨습니다. 현재 %s의 MP:%d\n", member.getName(), name, member.getName(), member.getMp());
    }
}
