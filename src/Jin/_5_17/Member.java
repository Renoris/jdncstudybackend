package Jin._5_17;


import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private List<Item> items;
    private int hp;
    private int mp;

    private int potionToxic;
    private int maxHp;
    private int maxMp;

    public Member(String name, int HP, int MP) {
        this.items = new ArrayList<>();
        this.name = name;
        this.hp = HP;
        this.mp = MP;
        this.potionToxic = 0;
        this.maxHp = 200;
        this.maxMp = 200;
    }

    public void printAllItem () {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s의 아이템 리스트: ", name));
        if (items.size() > 0) {
            for (Item item: items) {
                sb.append(item.name).append(", ");
            }
            if (sb.toString().contains(",")) {
                sb.deleteCharAt(sb.lastIndexOf(","));
            }
        } else {
            sb.append("없음");
        }

        System.out.println(sb);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 구현해 보세요
     */
    public void firstElixirUse() {
        items.removeIf((item -> {
            if (item instanceof ElixirPotion potion) {
                potion.use(this);
                return true;
            }
            return false;
        }));
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printStatus() {
        System.out.printf("%s의 HP:%d MP:%d 포션중독수치:%d\n",name, hp, mp, potionToxic);
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getMaxMp() {
        return maxMp;
    }

    public int getPotionToxic() {
        return potionToxic;
    }

    public void setPotionToxic(int potionToxic) {
        this.potionToxic = potionToxic;
    }
}
