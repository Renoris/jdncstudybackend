package Jin._5_16;


import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private int age;

    private List<Item> items;

    private int hp;

    private int mp;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
        this.hp = 100;
        this.mp = 100;
        items = new ArrayList<>();
    }

    public void printStatus() {
        System.out.printf("%s HP:%d MP:%d\n",name,hp,mp);
    }

    private void printNothingItemsMessage() {
        System.out.printf("%s는 어떤 아이템도 지니고 있지 않습니다.\n", name);
    }

    /**
     * 이 메소드를 작성(구현) 해 주세요.
     */
    private void processingUseAllItem() {
        for (Item item : items) {
            if (item instanceof Potion) {/////이거 사용하지말라고 배웠는데... 빡대가리라 생각나는게 이거밖에없는거같은데...
                Potion potion = (Potion) item;
                potion.use(this);
            }
        }
    }

    public void hasItems() {
        System.out.println(items.size() > 0 ? name+"은(는) 아이템을 가지고 있습니다." : name+"은(는) 아이템을 가지고 있지 않습니다.");
    }

    public void allItemUse() {
        if (items.size() == 0) printNothingItemsMessage();
        else processingUseAllItem();
    }

    public List<Item> getItems() {
        return items;
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

    public void addItem(Item item) {
        items.add(item);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("이름: %-9s 나이:%-3d", name, age);
    }
}
