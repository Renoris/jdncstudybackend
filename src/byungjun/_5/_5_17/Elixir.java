package byungjun._5._5_17;

public class Elixir extends Item implements ElixirPotion {

    private int value;

    public Elixir(String name, int value) {
        super(name);
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s 회복량:%d%%",super.toString(), value);
    }

    @Override
    public void use(Member member) {
        System.out.printf("%s의 HP,MP 수치가 %d%% 만큼 오릅니다.\n",member.getName() ,value);
        member.setHp(member.getHp() + member.getMaxHp()*value/100);
        member.setMp(member.getMp() + member.getMaxMp()*value/100);
    }

    @Override
    public void increasePotionToxic(Member member) {
        System.out.printf("%s의 포션중독 수치가 %d 만큼 오릅니다.\n",member.getName(), value/10);
        member.setPotionToxic(member.getPotionToxic() + value/10);
    }
}
