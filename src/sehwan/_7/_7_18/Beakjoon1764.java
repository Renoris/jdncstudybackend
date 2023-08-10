package sehwan._7._7_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Beakjoon1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int dud = Integer.parseInt(st.nextToken());
        int bo = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();
        List<String> dudbojab = new ArrayList<>();

        for(int i = 0; i < dud; i++) {
            set.add(br.readLine());
        }

        for(int i = 0; i < bo; i++) {
            String dudbo = br.readLine();
            if(set.contains(dudbo)) dudbojab.add(dudbo);
        }

        Collections.sort(dudbojab);

        sb.append(dudbojab.size()).append("\n");
        for(String name : dudbojab) {
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}
