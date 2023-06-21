package sehwan._6_20;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class beakjoon10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int num;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> tc = new HashMap<>();

        for(int i = 0; i < n; i++) {
            num = Integer.parseInt(st.nextToken());
            if(tc.containsKey(num)) {
                tc.put(num, tc.get(num) + 1);
            } else tc.put(num, 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            num = Integer.parseInt(st.nextToken());
            if(tc.containsKey(num)) {
                sb.append(tc.get(num)).append(" ");
            } else sb.append(0).append(" ");
        }

        System.out.println(sb);
    }
}
