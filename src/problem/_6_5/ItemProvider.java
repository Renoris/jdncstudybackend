package problem._6_5;

public class ItemProvider {

    public Playable getToPlayableByMember(Member member, String itemList) {
        return new Dummy(member);
    }

}
