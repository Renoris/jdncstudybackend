package sehwan._6._6_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class beakjoon1920 {
    public static List<Integer> ns;
    public static StringTokenizer st;
    public static StringBuilder sb = new StringBuilder();
    public static int m;
    public static boolean check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        ns = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            ns.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(ns);

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < m; i++) {
            check = false;
            getResult(0, n, Integer.parseInt(st.nextToken()));

            if(check) sb.append("1\n");
            else sb.append("0\n");
        }

        System.out.println(sb);
    }

    private static void getResult(int first, int last, int target) throws IOException {
        int center = Math.round((first+last)/2);
        if(ns.get(center) == target) {
            check = true;
            return;
        }
        if(last - first == 1) return;
        if(ns.get(center) < target) {
            getResult(center, last, target);
        } else {
            getResult(first, center, target);
        }
    }
}
