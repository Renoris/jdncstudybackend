package pooreum._5_10;

public class Member {
    private String name;
    private String weapon;
    private int arm;

    public Member(String name, String weapon, int arm) {
        this.name = name;
        this.weapon = weapon;
        this.arm = arm;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {this.weapon = weapon; }

    public int getArm() {return arm;}
    public void setArm(int arm) {this.arm = arm;}





    public void weaponExplain() {
        if (weapon == null) {
            System.out.printf("%s는 어떤 무기도 가지고 있지 않습니다.\n", name, weapon, arm);
            return;
        }


        if(weapon.equals("화염방사기")){
            System.out.printf("%s는 %s을 사용하여 화살로 %d의 피해를 줄 수 있습니다.\n", name, weapon,arm);
        }else if(weapon.equals("적궁백시") || weapon.equals("페일노트")){
            System.out.printf("%s는 %s를 사용하여 화살로 %d의 피해를 줄 수 있습니다.\n", name, weapon,arm);
        }else if(weapon.equals("AK47")||weapon.equals("사사성광")){
            System.out.printf("%s는 %s으로 총알을 발사하여 %d의 피해를 줄 수 있습니다.\n", name, weapon,arm);
        }else if(weapon.equals("빛의 검")||weapon.equals("레바테인")){
            System.out.printf("%s는 %s을 휘둘러 %d의 피해를 줄 수 있습니다.\n", name, weapon,arm);
        }else{
            System.out.printf("%s는 %s으로 주먹을 휘둘러 %d의 피해를 줄 수 있습니다.\n", name, weapon,arm);
        }

    }

    @Override
    public String toString() {
        return String.format("이름: %-9s 나이:%-3d", name, weapon ,arm);
    }
}
