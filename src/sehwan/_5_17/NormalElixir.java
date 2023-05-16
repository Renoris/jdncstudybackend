package sehwan._5_17;

public class NormalElixir extends Item implements ElixirPotion{
    int value;

    public NormalElixir(String name, String value) {
        super(name);
        this.value = Integer.parseInt(value);
    }

    @Override
    public void increasePotionToxic(Member member) {
        member.setPotionToxic(member.getPotionToxic() + 3);
        System.out.println(member.getName() + "의 포션중독 수치가 " + member.getPotionToxic() + " 만큼 오릅니다.");
    }

    @Override
    public void use(Member member) {
        System.out.println(member.getName() + "이 엘릭서를 사용합니다.");
        System.out.println(member.getName() + "의 HP,MP 수치가 30%만큼 오릅니다.");
        member.setHp(member.getHp() + member.getMaxHp() / 10 * 3);
        member.setMp(member.getMp() + member.getMaxMp() / 10 * 3);
        increasePotionToxic(member);
    }
}
