package byungjun._6_5;

public class Player extends Playable {

    public Player (Member member) {
        super(member);
    }

    /**
     * 작성해야할것
     * @return
     */
    @Override
    public boolean checkWeapon() {
        boolean flag = false;
        for (Item item : items) {
            if (item instanceof Weapon) {
                flag = true;
            }
        }
        return flag;
    }
}
