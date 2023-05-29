package sehwan._5_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon4779 {
    private static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n;
        while((n = br.readLine()) != null) {
            sb.append("-".repeat((int)Math.pow(3, Double.parseDouble(n))));

            getResult(0, sb.length());

            System.out.println(sb);
            sb.delete(0, sb.length());
        }
    }

    private static void getResult(int a, int b) {
        if(b - a == 1) return;
        // 3등분한다
        int c = a + ((b - a) / 3);
        int d = a + (((b - a) / 3) * 2);
        // 가운데를 지운다
        sb.replace(c, d, " ".repeat(d - c));
        // 왼쪽 순회
        getResult(a, c);
        // 오른쪽 순회
        getResult(d, b);
        // 출력
    }
}
