package Jin._5_17;

public class HeightElixir extends Item implements ElixirPotion {

    private int value;
    private int potionToxicIncrease = 5;
    public HeightElixir(String name,int value) {
        super(name);
        this.value = value;
    }

    public void increasePotionToxic(Member member){
        member.setPotionToxic(member.getPotionToxic()+potionToxicIncrease);
        System.out.println(member.getName() + "의 포션중독 수치가 " + member.getPotionToxic() + " 만큼 오릅니다.");
    }

    @Override
    public void use(Member member) {
        System.out.println(member.getName() + "이 엘릭서를 사용합니다.");
        System.out.println(member.getName() + "의 HP,MP 수치가 50%만큼 오릅니다.");
        member.setHp((int) (member.getHp() + member.getMaxHp() *0.5));
        member.setMp((int) (member.getMp() + member.getMaxMp() *0.5));
        increasePotionToxic(member);
    }
}
