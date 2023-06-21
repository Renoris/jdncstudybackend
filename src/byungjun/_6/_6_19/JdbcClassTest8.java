package byungjun._6._6_19;

public class JdbcClassTest8 {

    public static void main (String[] args) {
        WeaponProvider weaponProvider = new WeaponProvider();
        Member[] members = getMemberList();

        for(Member member : members) {
            try {
                Member equipWeaponMember = weaponProvider.getEquipWeaponMember(member);
                System.out.println(equipWeaponMember.getProfile());
            } catch (WeaponException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static Member[] getMemberList() {
        return new Member[] {
            new Member("Danu", RangeType.SHORT),
            new Member("Nuada", RangeType.SHORT),
            new Member("Morríghan", RangeType.LONG)
        };
    }
}
