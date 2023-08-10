package KH._5._5_9;

public class Member {
    private String name;
    private int age;

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

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }


    /**
     * 이부분은 수정하지 마세요
     */
    @Override
    public String toString() {
        return String.format("이름: %-9s 나이:%-3d", name, age);
    }
}
