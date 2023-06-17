package problem._6_19;

public class WeaponProvider {

    private MemberWeaponRepository memberWeaponRepository = MemberWeaponRepository.getInstance();

    public Member getEquipWeaponMember (Member member) throws WeaponException {
        member.setWeapon(new Weapon("아무것도 가지고 있지 않다",null));
        return member;
    }

}
