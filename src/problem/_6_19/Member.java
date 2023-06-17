package problem._6_19;

public final class Member {
    private String name;

    private RangeType type;

    private Weapon weapon;

    public Member(String name, RangeType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getProfile() {
        return String.format("캐릭터 - 이름:%s 공격타입:%s 장착한무기:%s", name, type.name(), weapon.getName());
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public RangeType getType() {
        return type;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
