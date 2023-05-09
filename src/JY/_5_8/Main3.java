package JY._5_8;

import java.util.Scanner;

public class Main3 {
    public static void main (String[] args) {
        // 프로그래머스 n보다 커질 때까지 더하기
        Scanner scanner = new Scanner(System.in);

        // 쉼표(+공백)으로 구분 된 숫자를 문자열로 입력받아 배열에 저장
        String input = scanner.nextLine();
        String[] inputArr = input.split(",\\s*");
        // ",\\s*"는 쉼표와 0개 이상의 공백문자(스페이스, 탭, 줄바꿈 등)가 조합된 패턴을 찾아 구분자로 사용

        // 문자열로 저장된 값들을 정수형으로 바꿔 numbers에 복사
        int[] numbers = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            numbers[i] = Integer.parseInt(inputArr[i]);
        }

        // 기준 값을 입력받음
        int n = scanner.nextInt();

        // 배열의 숫자들을 차례차례 더하고 기준값을 넘으면 중지 후 최종 값 출력
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (sum > n) {
                break;
            }
        }
        System.out.println(sum);
    }
}
