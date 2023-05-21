package Jin.p_5_22;

import java.util.Stack;

public class p2_s {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        ///크레인
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {//세로줄중 가장위에있는 물건 찾기
                if (board[i][move - 1] != 0) {//빈값이아닌지확인
                    if (!stack.isEmpty() && stack.peek() == board[i][move - 1]) {//스택이 비어있는지 맨위에 스택이 현재물건과 같은지
                        stack.pop();//같으면 없애고 답
                        answer += 2;
                    } else {//아니면 물건추가
                        stack.push(board[i][move - 1]);
                    }
                    board[i][move - 1] = 0;//기존값 없애기
                    break;
                }
            }
        }

        return answer;
    }
    }


