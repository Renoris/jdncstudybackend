package KH._5_17;

import KH._5_17.Item;
import KH._5_17.Member;
import KH._5_17.Potion;

public class HpPotion extends Item implements Potion {

    private int value;

    public HpPotion (String name, int value) {
        super(name);
        this.value = value;
    }
    @Override
    public void use(Member member) {
        member.setHp(member.getHp() + value);
        System.out.printf("%s 님이 %s 아이템을 사용하셨습니다. 현재 %s의 HP:%d\n", member.getName(), name, member.getName(), member.getHp());
    }
}
