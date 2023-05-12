package problem._5_15;

public class MpPotion extends Item { // 이 한줄은 수정이 가능합니다.

    private int value;

    public MpPotion(String name, int value) {
        super(name);
        this.value = value;
    }

    public void use(Member member) {
        member.setMp(member.getMp() + value);
        System.out.printf("%s 님이 %s 아이템을 사용하셨습니다. 현재 %s의 MP:%d\n", member.getName(), name, member.getName(), member.getMp());
    }
}
