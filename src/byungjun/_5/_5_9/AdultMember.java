package byungjun._5._5_9;

public class AdultMember extends Member {
    public AdultMember(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString()+" 미성년자 유무: N";
    }
}
