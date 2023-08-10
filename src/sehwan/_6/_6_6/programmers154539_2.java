package sehwan._6._6_6;

import java.util.Arrays;
import java.util.Stack;

public class programmers154539_2 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 3, 5};
        int[] result = Solution(numbers);

        for(int i : result) System.out.println(i + " ");
    }

    private static int[] Solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);

        Stack<Integer> stack = new Stack();

        stack.add(0);

        for(int i = 1; i < numbers.length; i++) {

            while(true) {
                if(numbers[stack.peek()] < numbers[i]) {
                    int temp = stack.pop();
                    answer[temp] = numbers[i];
                } else {
                    stack.push(i);
                    break;
                }

                if(stack.isEmpty()) {
                    stack.push(i);
                    break;
                }
            }
        }

        return answer;
    }
}

