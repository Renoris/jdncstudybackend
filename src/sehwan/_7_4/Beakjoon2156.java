package sehwan._7_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://yabmoons.tistory.com/512
public class Beakjoon2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] wines = new int[n];
        int[] dp = new int[n + 1];

        dp[0] = 0;
        wines[0] = Integer.parseInt(br.readLine());
        dp[1] = wines[0];
        wines[1] = Integer.parseInt(br.readLine());
        dp[2] = dp[1] + wines[1];

        for(int i = 2; i < n; i++) {
            wines[i] = Integer.parseInt(br.readLine());

            dp[i + 1] = Math.max(dp[i - 1] + wines[i], dp[i - 2] + wines[i - 1] + wines[i]);
            dp[i + 1] = Math.max(dp[i], dp[i + 1]);
        }

        System.out.println(dp[n]);
    }


}
