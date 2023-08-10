package sehwan._6._6_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon15651 {
    public static int[] sequence;
    public static int n;
    public static int m;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        sequence = new int[m];

        getSequence(0);

        System.out.println(sb);
    }

    private static void getSequence(int start) {
        for(int i = start; i < m; i++) {
            for(int j = 1; j <= n; j++) {
                sequence[i] = j;
                if(i == m - 1) addSB();
                getSequence(i + 1);
            }
            return;
        }
    }

    private static void addSB() {
        for(int i = 0; i < m; i++) {
            sb.append(sequence[i]).append(" ");
        }
        sb.append("\n");
    }
}
