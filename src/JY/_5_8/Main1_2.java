package JY._5_8;

import java.util.Arrays;
import java.util.Scanner;

public class Main1_2 {
    public static void main (String[] args) {

        // 배열 submit에 제출자 28명의 출석번호 입력받아 저장
        Scanner scanner = new Scanner(System.in);

        int[] submit = new int[28];
        for (int i = 0; i < submit.length; i++) {
            submit[i] = scanner.nextInt();
        }
        // 배열을 오름차순으로 정리
        Arrays.sort(submit);

        System.out.println(Arrays.toString(submit));

        for (int i = 1; i <= 30; i++) {
            if (Arrays.binarySearch(submit, i) < 0) {
                System.out.print(i + " ");
            }
        }
    }
}
