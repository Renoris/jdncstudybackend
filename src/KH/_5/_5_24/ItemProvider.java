package KH._5._5_24;

public class ItemProvider {
    public Playable getToPlayableByMember(Member member, String itemList) {
        Playable playable = new Playable() {
            ItemRepository ir = new ItemRepository();
            String[] list = itemList.split(",");

            @Override
            public String getProfile() {
                String[] profile = member.getProfile().split(" ");
                return String.format("실험체 - 이름:%s %s", member.getName(), profile[2]);
            }

            @Override
            public void addItem(Item item) {

            }

            @Override
            public void printAllItems() {
                System.out.printf("%s의 아이템은 : %s\n",member.getName(), itemList);
            }
        };



//        System.out.println(itemList.split(","));
        return playable;
    }

}
