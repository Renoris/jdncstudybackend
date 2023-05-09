package Jin.p_5_9;


import java.util.Arrays;

public class ChildrenDistibution extends Member {

    private boolean x;
    public ChildrenDistibution() {
        super("", 0);
    }
    public ChildrenDistibution(String name, int age) {
        super(name, age);
        x = (age < 20);
    }

    @Override
    public String toString() {
        return String.format("이름: %-9s 나이:%-3d 미성년자 유무:%-1s", getName(), getAge(), x ? "Y" : "N");
    }

    public Member[] convertMember(Member[] members) {
        return Arrays.stream(members)
                .map(member -> new ChildrenDistibution(member.getName(), member.getAge()))
                .toArray(Member[]::new);
    }

}