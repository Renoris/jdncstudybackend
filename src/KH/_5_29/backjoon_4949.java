package KH._5_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class backjoon_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string =" ";
        while (true){
            string = br.readLine();
            if(string.equals(".")){
                break;
            }
            String[] strings = string.split("");
            Stack<String> stack = new Stack<>();
            for(String st : strings){
                if(st.equals("(") || st.equals(")") || st.equals("[") || st.equals("]")){
                    if(st.equals(")")){
                        if(stack.size() > 0 && stack.peek().equals("(")){
                            stack.pop();
                        }
                        else stack.push(st);
                    } else if (st.equals("]")) {
                        if(stack.size() > 0 &&stack.peek().equals("[")){
                            stack.pop();
                        }
                        else stack.push(st);
                    }
                    else stack.push(st);
                }

            }
            System.out.printf("%s\n",stack.size() == 0 ? "yes" : "no");
        }
    }
}
