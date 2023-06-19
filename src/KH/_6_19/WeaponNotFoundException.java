package KH._6_19;

public class WeaponNotFoundException extends WeaponException{
    public WeaponNotFoundException(String message){
        super(message+"는 장착할 무기가 없습니다");
    }

}
