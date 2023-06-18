package byungjun._6._6_19;

public class NotExistWeaponException extends WeaponException {

    public NotExistWeaponException(String name) {
        super(String.format("%s는 장착할 무기가 없습니다.", name));
    }
}
