package KH._7_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[][] dp = new int[31][31];
    public static int Combination(int n, int r){
        if(dp[n][r] > 0) return dp[n][r];
        if(n == r || r == 0) return 1;
        else return dp[n][r] = Combination(n-1, r-1) + Combination(n-1, r);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            System.out.println(Combination(m, n));
        }
    }
}
