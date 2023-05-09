package Jin.p_5_10;

public class Member {
    private String name;
    private int age;
    private Weapon weapon;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void weaponExplain() {
        if (weapon == null) {
            System.out.printf("%s는 어떤 무기도 가지고 있지 않습니다.\n", name);
            return;
        }

        System.out.printf("%s는 %s\n", name, weapon);
    }

    @Override
    public String toString() {
        return String.format("이름: %-9s 나이:%-3d", name, age);
    }
}
