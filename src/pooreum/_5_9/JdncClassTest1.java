package pooreum._5_9;

public class JdncClassTest1 {

    /**
     * 이부분은 복사 붙여넣기해서 가져가시되 수정하지 마세요
     */
    public static void main (String[] args) {
        Member[] members = {
                new Member("Jackie", 22, "N"),
                new Member("Adriana", 22, "N"),
                new Member("Isol", 16, "Y"),
                new Member("Jan", 25, "N"),
                new Member("Aya", 26, "N"),
                new Member("Hyejin", 18, "Y"),
                new Member("Xiukai", 34, "N"),
                new Member("Johann", 30, "N"),
                new Member("Hyunwoo", 18,"Y")
        };


        //문제를 푸실때 아래 코드의 주석들을 해제해 주세요.
//        ChildrenDistibution childrenDistibution = new ChildrenDistibution();
//        members = childrenDistibution.convertMember(members);

        for (int i = 0; i < members.length; i++) {
            System.out.println(members[i]);
        }
    }
}
