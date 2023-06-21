package byungjun._6._6_19;

public class WeaponProvider {

    private MemberWeaponRepository memberWeaponRepository = MemberWeaponRepository.getInstance();

    public Member getEquipWeaponMember (Member member) throws WeaponException {
        Weapon weapon = memberWeaponRepository.getWeaponByMemberName(member.getName());
        if (weapon == null) {
            throw new NotExistWeaponException(member.getName());
        }

        member.setWeapon(weapon);

        if (!member.getWeapon().rangeType.equals(member.getType())) {
            throw new DifferentRangeTypeWeaponException(member.getName());
        }

        return member;
    }

}
