package KH._6_19;

public class WeaponProvider {

    private MemberWeaponRepository memberWeaponRepository = MemberWeaponRepository.getInstance();

    public Member getEquipWeaponMember(Member member) throws WeaponException {
        Weapon weapon = memberWeaponRepository.getWeaponByMemberName(member.getName());

        if(weapon == null){
            throw new WeaponNotFoundException(member.getName());
        }

        if(!weapon.rangeType.equals(member.getType())){
            throw new WeaponTypeException(member.getName());
        }

        member.setWeapon(weapon);
        return member;
    }


}
