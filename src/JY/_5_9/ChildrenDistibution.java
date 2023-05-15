package JY._5_9;




public class ChildrenDistibution extends Member {
    String children;

    public ChildrenDistibution() {
        super("", 0);
    }

    public ChildrenDistibution(String name, int age, String children) {
        super(name, age);
        this.children = children;
    }

    public Member[] convertMember(Member[] members) {
        Member[] members2 = new ChildrenDistibution[members.length];
        for (int i = 0; i < members.length; i++) {
            if (members[i].getAge() <= 19) {
                children = "Y";
            } else {
                children = "N";
            }
            members2[i] = new ChildrenDistibution(members[i].getName(), members[i].getAge(), children);
        }
        return members2;
    }

    @Override
    public String toString() {
        return super.toString()+"미성년자 유무 : "+children;
    }
}




