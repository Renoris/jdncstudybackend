package KH._6._6_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class backjoon1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int num = Integer.parseInt(br.readLine());
        int number = 1;
        for(int i = 0; i < num; i++){
            boolean check = true;
            int input = Integer.parseInt(br.readLine());
            while(true){
                if(stack.empty() || stack.peek() < input){
                    stack.push(number);
                    sb.append("+\n");
                    number++;
                }
                else if(stack.peek() == input){
                    stack.pop();
                    sb.append("-\n");
                    break;
                }
                else if(stack.peek() > input){
                    check = false;
                    break;
                }
            }
            if(!check){
                sb.setLength(0);
                sb.append("NO");
                break;
            }
        }
        System.out.println(sb.toString());
    }
}
