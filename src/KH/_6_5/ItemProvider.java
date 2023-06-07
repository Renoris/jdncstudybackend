package KH._6_5;

public class ItemProvider {

    public Playable getToPlayableByMember(Member member, String itemList) {
        ItemRepository ir =ItemRepository.getInstance();
        System.out.println(ir);
        return new Dummy(member);
    }

}
