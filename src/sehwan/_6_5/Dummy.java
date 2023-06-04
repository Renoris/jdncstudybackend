package sehwan._6_5;


import java.util.ArrayList;

public class Dummy extends Playable {

    public Dummy(Member member) {
        super(member);
    }

    @Override
    public String getProfile() {
        return member.getName();
    }

    @Override
    public void addAllItems(ArrayList<Item> items) {
        super.addAllItems(items);
    }

    @Override
    public boolean checkWeapon() {
        Weapon weapon = null;
        for(Item i : items) {
            weapon = i instanceof Weapon ? ((Weapon) i) : null;
            if (weapon != null) break;
        }

        if(weapon == null) throw new NotTakeWeaponException();

        return true;
    }

    @Override
    public void printAllItems() {
        if(checkWeapon()) super.printAllItems();
    }
}
