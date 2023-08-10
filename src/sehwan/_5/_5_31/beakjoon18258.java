package sehwan._5._5_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class beakjoon18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int back = -1;

        for(int i = 0; i < n; i++) {
            String[] tc = br.readLine().split(" ");
            switch (tc[0]) {
                case "push" : q.add(Integer.parseInt(tc[1])); back = Integer.parseInt(tc[1]); break;
                case "pop" : if(q.isEmpty()) sb.append(-1).append("\n"); else sb.append(q.poll()).append("\n"); break;
                case "size" : sb.append(q.size()).append("\n"); break;
                case "empty" : if(q.isEmpty()) sb.append(1).append("\n"); else sb.append(0).append("\n"); break;
                case "front" : if(q.isEmpty()) sb.append(-1).append("\n"); else sb.append(q.peek()).append("\n"); break;
                case "back" : if(q.isEmpty()) sb.append(-1).append("\n"); else sb.append(back).append("\n"); break;
            }
        }

        System.out.println(sb);
    }
}
