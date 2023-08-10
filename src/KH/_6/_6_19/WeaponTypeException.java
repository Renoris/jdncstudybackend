package KH._6._6_19;

public class WeaponTypeException extends WeaponException{
    public WeaponTypeException(String message){
        super(message+"와 장착한 무기의 RangeType이 맞지 않습니다");
    }
}
