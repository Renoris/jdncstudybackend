package sehwan._6_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon11047_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;

        int[] values = new int[n];
        for(int i = 0; i < n; i++) {
            values[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < n; i++) {
            count += k / values[n - i - 1];
            k = k % values[n - i - 1];
            if(k == 0) break;
        }

        System.out.println(count);
    }
}
