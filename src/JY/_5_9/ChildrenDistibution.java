package JY._5_9;


public class ChildrenDistibution extends Member {
    String children;

    public ChildrenDistibution(String name, int age, String children) {
        super(name, age);
        this.children = children;
    }

    public void convertMember() {
        if (getAge() >= 19) {
            children = "Y";
        } else {
            children = "N";
        }
    }




    @Override
    public String toString() {
        return String.format("이름: %-9s 나이:%-3d 미성년자 유무:%s", getName(),getAge(),children);
    }
}


