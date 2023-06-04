package byungjun._6._6_6.programmers;

import java.util.Stack;

class Solution2 {

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> rs = new Stack<>();
        Stack<Integer> ls = new Stack<>();

        for (int i = numbers.length - 1; i >= 0 ; i--) {
            boolean flag = false;
            int num = numbers[i];
            while (rs.size() > 0) {
                if (rs.peek() > num) {
                    flag = true;
                    answer[i] = rs.peek();
                    break;
                } else {
                    ls.add(rs.pop());
                }
            }

            while (ls.size() > 0) {
                rs.add(ls.pop());
            }

            if (!flag) {
                answer[i] = -1;
            }

            rs.add(num);
        }

        return answer;
    }
}