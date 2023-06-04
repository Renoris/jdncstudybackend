package byungjun._6._6_7._1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int input = 1;
        for (int i = 0; i < size; i++) {
            boolean flag = false;
            int num = Integer.parseInt(br.readLine());

            if (stack.size() > 0 && stack.peek() == num) {
                stack.pop();
                sb.append("-").append("\n");
                flag = true;
            } else {
                while (input <= size) {
                    stack.add(input);
                    sb.append("+").append("\n");
                    input++;

                    if (stack.peek() == num) {
                        sb.append("-").append("\n");
                        stack.pop();
                        flag = true;
                        break;
                    }
                }
            }

            if (!flag) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}
