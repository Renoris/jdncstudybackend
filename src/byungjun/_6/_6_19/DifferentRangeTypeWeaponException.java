package byungjun._6._6_19;

public class DifferentRangeTypeWeaponException extends WeaponException {

    public DifferentRangeTypeWeaponException(String name) {
        super(String.format("%s와 장착한 무기의 RangeType이 맞지 않습니다.", name));
    }
}
