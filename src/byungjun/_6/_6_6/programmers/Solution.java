package byungjun._6._6_6.programmers;

import java.util.Stack;

class Solution {

    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[numbers.length];

        for (int i = numbers.length - 1; i >= 0 ; i--) {
            boolean flag = false;
            int num = numbers[i];
            while (stack.size() > 0) {
                if (stack.peek() > num) {
                    flag = true;
                    answer[i] = stack.peek();
                    break;
                } else {
                    stack.pop();
                }
            }

            if (!flag) {
                answer[i] = -1;
            }

            stack.add(num);
        }

        return answer;
    }
}