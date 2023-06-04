package byungjun._5._5_9;

public class DistributedMember extends Member {

    public DistributedMember(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        char child = getAge() > 19 ? 'Y' : 'N';
        return super.toString()+String.format(" 미성년자 유무: %s", child);
    }
}
