package sehwan._5._5_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();
        String[][] testCases = new String[5][];

        //5개의 문자열을 입력받습니다.
        for(int i = 0; i < 5; i++) {
            testCases[i] = br.readLine().split("");
        }

        //문자열의 최대 길이(15)만큼 반복합니다.
        //문자열마다 순차적으로 글자를 추가합니다. 문자열이 끝난 경우에는 예외가 떠서 무시됩니다.
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                try {
                    sb.append(testCases[j][i]);
                }
                catch (Exception e) {

                }
            }
        }

        System.out.println(sb);
    }
}
