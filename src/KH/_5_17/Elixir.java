package KH._5_17;

public class Elixir extends Item implements Potion{
    private int value;
    public Elixir(String name, int value) {
        super(name);
        this.value = value;
    }

    @Override
    public void use(Member member) {
        member.setHp(member.getHp() + (member.getMaxHp()*value/100));
        member.setMp(member.getMp() + (member.getMaxMp()*value/100));
        member.setPotionToxic(value/10);
        System.out.printf("%s 님이 엘릭서를 사용하셨습니다.\n%s의 HP,MP 수치가 %d%% 만큼 오릅니다.\n%s의 포션중독 수치가 %d 만큼 오릅니다.\n", member.getName(), member.getName(),value, member.getName(),member.getPotionToxic());

    }
}
