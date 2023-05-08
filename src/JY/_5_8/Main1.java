package JY._5_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // 백준 5597번
        // 30개의 배열을 만들고 1~30까지 숫자를 넣는다
        // 입력받은 숫자를 배열하나에 넣는다
        // 30개 배열과 입력받은 배열을 비교하여 없는 번호는 따로 배열에 저장한다
        // 없는번호 배열에서 가장 작은 숫자와 그 다음 숫자를 출력한다.

        // 1~30까지의 숫자가 들어있는 배열 n
        int[] n = new int[30];
        for (int i = 0; i < n.length; i++) {
            n[i] = i+1;
        }

        // 잘 들어갔는지 확인
        System.out.println(Arrays.toString(n));

        // 입력받은 숫자를 count해서 배열을 만들고 숫자들을 배열에 저장
        Scanner scanner = new Scanner(System.in);

        List<Integer> temp = new ArrayList<>(); // ArrayList 객체 temp 생성
        while (true) {
            String input = scanner.next();  // 입력받은 문자열을 변수 input에 저장
            if (input.equals("end")) {  // 입력받은 문자열이 end일 경우 반복문 종료
                break;
            }
            temp.add(Integer.parseInt(input));  // 입력받은 문자열을 정수형으로 변환 후 temp에 추가
        }

        // submit 배열을 만들고 temp에 저장된 값들을 순서대로 복사
        int[] submit = new int[temp.size()];
        for (int i = 0; i < submit.length; i++) {
            submit[i] = temp.get(i);
        }

        // 잘 들어갔는지 확인
        System.out.println(Arrays.toString(submit));

        // 출석번호 n과 제출자 submit을 비교하여 없는 숫자를 찾아서 배열에 저장

        // ArratList 객체 notSubmitted 생성
        List<Integer> notSubmitted = new ArrayList<>();
        // n 배열을 반복문으로 돌려 submit 배열에 n[i]가 없을 경우 notSubmmitted에 n[i] 추가
        for (int i = 0; i < n.length; i++) {
            if (!contains(submit, n[i])) {
                notSubmitted.add(n[i]);
            }
        }

        // notSubmitted에서 가장 작은 숫자와 그 다음 숫자 출력
        int min = notSubmitted.get(0);
        int nextMin = notSubmitted.get(1);
        System.out.println(min + " " + nextMin);
    }

    // contains 메소드 선언: arr 배열에 item 요소가 있는지 검사 후, 있으면 true, 없으면 false를 반환
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {     // arr 배열을 반복문으로 순회
            if (item == n) {    // arr 배열에 item 요소가 있는 경우
                return true;    // true 반환
            }
        }
        return false;           // arr 배열에 item 요소가 없는 경우 false 반환
    }
}