package sehwan._5_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class beakjoon4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack;
        ArrayList<String> tc = new ArrayList<String>();

        while(true) { //testcase를 입력받아 저장한다. 마지막 온점 제외.
            String s = br.readLine();
            if(s.equals(".")) break;
            tc.add(s);
        }



        for(String s : tc) {
            boolean check = true; //균형있다면 true, 아니면 false. 아무것도 없으면 균형잡힌것이므로 기본적으로 true;
            String temp = s.replaceAll("[^\\[\\]()]+", ""); //중,소괄호 빼고 전부 제거
            stack = new Stack<Character>(); //매 testcase마다 스택 초기화

            for(int i = 0; i < temp.length(); i++) {
                if(temp.charAt(i) == ')') {
                    if(stack.isEmpty()) { //스택이 비어있는데 닫는 괄호이면 불균형
                        check = false;
                        break;
                    }
                    if(stack.peek() != '(') { //이전 기호가 여는 괄호가 아니라면 불균형
                        check = false;
                        break;
                    }
                    stack.pop(); //이전 기호가 여는 괄호라면 스택에서 제거
                } else if(temp.charAt(i) == ']') {
                    if(stack.isEmpty()) {
                        check = false;
                        break;
                    }
                    if(stack.peek() != '[') {
                        check = false;
                        break;
                    }
                    stack.pop();
                } else {
                    stack.push(temp.charAt(i)); //현재 괄호가 여는 괄호라면 스택에 추가
                }
            }

            if(!stack.isEmpty()) check = false;
            sb.append(check ? "yes" : "no").append("\n"); //결과에 따라 Yes or No 추가
        }

        System.out.println(sb);
    }
}
