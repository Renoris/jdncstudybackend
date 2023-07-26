package KH._7_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static void combination(int n, boolean[] visited, int[][] team){
        int result = 0;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] team = new int[N+1][N+1];
        boolean[] visited = new boolean[N+1];
        for(int i = 1; i <= N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; j++){
                team[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
