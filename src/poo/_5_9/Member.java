package poo._5_9;

public class Member {
    private String name;
    private int age;
    private String underage;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUnderage(String underage) {this.underage = underage;}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUnderage() {return  underage;}

    public Member(String name, int age, String underage) {
        this.name = name;
        this.age = age;
        this.underage = underage;
    }


    /**
     * 이부분은 수정하지 마세요
     */
    @Override
    public String toString() {
        return String.format("이름: %-9s 나이:%-3d 미성년자 유무: %s", name, age, underage);
    }
}
