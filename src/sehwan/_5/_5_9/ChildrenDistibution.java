package sehwan._5._5_9;

public class ChildrenDistibution extends Member{
    //미성년자 여부를 체크할 변수입니다.
    //어차피 다른곳에서 쓸데도 없으니 getter와 setter는 생략했습니다..
    private String check = "";

    //기본생성자 만들어주었습니다. 빈값으로 초기화 했습니다.
    public ChildrenDistibution() {
        super("", 0);
    }

    //이름, 나이에 더해 미성년자 여부까지 세팅하는 생성자입니다.
    public ChildrenDistibution(String name, int age, String check) {
        super(name, age);
        this.check = check;
    }

    public Member[] convertMember(Member[] members) {
        //나이가 20살 이하면 Y, 이상이면 N으로 check변수를 세팅합니다.
        for(int i = 0; i < members.length; i++){
            if(members[i].getAge() < 20) {
                check = "Y";
            } else {
                check = "N";
            }
            //해당 members[]를 ChildrenDistibution 클래스형으로 새로 초기화합니다. check의 값도 갖고, 오버라이딩한 toString()도 사용하기 위함.
            members[i] = new ChildrenDistibution(members[i].getName(), members[i].getAge(), check);
        }
        return members;
    }

    //출력 형식에 알맞게 오버라이딩합니다. 리턴하는 member[]의 자료형을 ChildrenDistibution으로 변경했기 때문에 이것을 호출하게 됩니다.
    @Override
    public  String toString() {
        return String.format("이름: %-9s 나이:%-3d 미성년자 유무:%-1s", getName(), getAge(), check);
    }
}
