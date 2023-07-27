package sehwan._7_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon1010 {

    public static int[] combination;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int west;
        int east;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            west = Integer.parseInt(st.nextToken());
            east = Integer.parseInt(st.nextToken());

            if (west > east - west) {
                west = east - west; // k를 더 작은 값으로 바꿔서 계산량을 줄임
            }

            long result = 1;
            for (int j = 1; j <= west; j++) {
                result *= (east - j + 1);
                result /= j;
            }

            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}
