package sehwan._6._6_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class beakjoon1874_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int now = 1;

        for(int i = 1; i <= n; i++) {
            int value = Integer.parseInt(br.readLine());

            while(now <= value) {
                stack.push(now++);
                sb.append("+\n");
            }

            if(stack.peek() == value) {
                stack.pop();
                sb.append("-\n");
            } else {
                sb = new StringBuilder().append("NO");
                break;
            }
        }

        System.out.println(sb);
    }
}
