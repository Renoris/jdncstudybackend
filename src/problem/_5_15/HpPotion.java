package problem._5_15;

public class HpPotion extends Item { // 이 한줄은 수정이 가능합니다.

    private int value;

    public HpPotion (String name, int value) {
        super(name);
        this.value = value;
    }

    public void use(Member member) {
        member.setHp(member.getHp() + value);
        System.out.printf("%s 님이 %s 아이템을 사용하셨습니다. 현재 %s의 HP:%d\n", member.getName(), name, member.getName(), member.getHp());
    }
}
