package sehwan._7_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] values = new int[n];
        int[] sum = new int[n + 1];
        st = new StringTokenizer(br.readLine());

        values[0] = Integer.parseInt(st.nextToken());
        sum[1] = values[0];
        for(int i = 1; i < n; i++) {
            values[i] = Integer.parseInt(st.nextToken());
            sum[i + 1] = sum[i] + values[i];
        }

        int start;
        int end;
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken()) - 1;
            end = Integer.parseInt(st.nextToken());

            int result = sum[end] - sum[start];
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}
