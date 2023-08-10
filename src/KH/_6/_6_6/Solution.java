package KH._6._6_6;

import java.util.Stack;

public class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[numbers.length];
        for(int i = numbers.length -1; i >= 0; i--){
            answer[i] = -1;
            while(!stack.empty() && stack.peek() <= numbers[i]){
                stack.pop();
            }
            if(!stack.empty() && stack.peek() > numbers[i]){
                answer[i] = stack.peek();
                stack.push(numbers[i]);
            }
            if(stack.empty()){
                stack.push(numbers[i]);
            }

        }
        return answer;
    }
}
