package sehwan._6._6_19;

public class WeaponProvider {

    private MemberWeaponRepository memberWeaponRepository = MemberWeaponRepository.getInstance();

    public Member getEquipWeaponMember (Member member) throws WeaponException {
        Weapon weapon = memberWeaponRepository.getWeaponByMemberName(member.getName());

        if(weapon == null) throw new NullWeaponException(member.getName()+"는 장착할 무기가 없습니다.");
        if(!member.getType().equals(weapon.rangeType)) throw new WeaponRangeException(member.getName()+"와 장착한 무기의 RangeType이 맞지 않습니다.");

        member.setWeapon(weapon);

        return member;
    }

}
