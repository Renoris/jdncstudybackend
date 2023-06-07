package byungjun._5._5_30._4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static char[] openBrackets = {'(', '['};

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        StringBuilder sb = new StringBuilder();
        while (true) {
            line = br.readLine();
            if (line.equals(".")) break;

            char[] arrays = line.toCharArray();
            Stack<Character> stack = new Stack<>();

            for (char alpha : arrays) {
                if (alpha == '(' || alpha == '[') {
                    stack.add(alpha);
                } else if (alpha == ')' || alpha == ']') {
                    int index = alpha == ')' ? 0 : 1;

                    if (stack.size() > 0 && stack.peek() == openBrackets[index]) {
                        stack.pop();
                    } else {
                        stack.add(alpha);
                    }
                }
            }
            sb.append(stack.size() > 0 ? "no" : "yes").append("\n");
        }

        System.out.println(sb);
    }
}
