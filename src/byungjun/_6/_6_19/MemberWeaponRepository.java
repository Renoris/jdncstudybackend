package byungjun._6._6_19;

import java.util.HashMap;
import java.util.Map;

public class MemberWeaponRepository {
    private static MemberWeaponRepository instance;

    public static MemberWeaponRepository getInstance() {
        if (instance == null) {
            instance = new MemberWeaponRepository();
        }
        return instance;
    }
    private Map<String, Weapon> memory;

    {
        memory = new HashMap<>();
        memory.put("Danu", new Weapon("검", RangeType.SHORT));
        memory.put("Morríghan", new Weapon("비수", RangeType.SHORT));
    }

    public Weapon getWeaponByMemberName(String name) {
        return memory.get(name);
    }
}
