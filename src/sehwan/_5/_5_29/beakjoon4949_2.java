package sehwan._5._5_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class beakjoon4949_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean check;

        while(true) {
            String s = br.readLine();
            if(s.equals(".")) break;
            check = getResult(s.replaceAll("[^\\[\\]()]+", ""));
            sb.append(check ? "yes\n" : "no\n");
        }
        System.out.println(sb);
    }

    private static boolean getResult(String s) {
        Stack<Character> stack = new Stack<>();
        Map map = new HashMap();
        map.put(')', '(');
        map.put(']', '[');

        for(int i = 0; i < s.length(); i++) {
            if(s.length() % 2 != 0) return false;

            char c = s.charAt(i);

            if(c == '(' || c == '[') {
                stack.push(c);
            }
            else if(stack.isEmpty()) return false;
            else if(map.get(c) != stack.peek()) return false;
            else stack.pop();
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}
