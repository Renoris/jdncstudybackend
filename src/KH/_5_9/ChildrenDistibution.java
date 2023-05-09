package KH._5_9;

import java.util.Arrays;

public class ChildrenDistibution extends Member{
    private boolean child;
    public ChildrenDistibution(){
        super( "",0);
    }
    public ChildrenDistibution(String name, int age){
        super(name, age);
        child = (age < 20);
    }

    @Override
    public String toString() {
        return String.format("이름: %-9s 나이:%-3d 미성년자 유무:%-1s", getName(), getAge(),child ?"Y":"N");
    }

    //이 부분은 진성님꺼 보고 따라했습니다 아직 잘 모르겠습니다
    public Member[] convertMember(Member[] members){
        return Arrays.stream(members)
                .map(member -> new ChildrenDistibution(member.getName(),member.getAge()))
                .toArray(Member[]::new);
    }
}
