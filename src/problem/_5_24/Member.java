package problem._5_24;

public final class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getProfile() {
        return String.format("실험체 이름:%s, 나이:%s", name, age);
    }
}
