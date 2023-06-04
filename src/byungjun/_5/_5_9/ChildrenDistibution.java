package byungjun._5._5_9;

import java.util.Arrays;

public class ChildrenDistibution {
    public Member[] convertMember(Member[] members) {
        Member[] convertedMember = new Member[members.length];
        for (int i = 0; i < members.length; i++) {
            Member member = members[i];

            String name = member.getName();
            int age = member.getAge();

            if (member.getAge() > 19) {
                convertedMember[i] = new AdultMember(name, age);
            } else {
                convertedMember[i] = new ChildrenMember(name, age);
            }
        }

        return convertedMember;
    }

    public Member[] shortConvert(Member[] members) {
        return Arrays.stream(members).map((member) -> member.getAge() > 19 ? new AdultMember(member.getName(), member.getAge()) : new ChildrenMember(member.getName(), member.getAge())).toArray(Member[]::new);
    }

    public Member[] convertMember2(Member[] members) {
        Member[] convertedMember = new Member[members.length];
        for (int i = 0; i < members.length; i++) {
            convertedMember[i] = new DistributedMember(members[i].getName(), members[i].getAge());
        }

        return convertedMember;
    }
}
