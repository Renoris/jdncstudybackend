package byungjun._5_22.programmers;

import java.util.Stack;

public class Solution {
    public int solution(int[][] board, int[] moves) {
        int result = 0;
        //바구니 생성
        Stack<Integer> baguni = new Stack<>();

        for (int move: moves) {
            int pick = pickUp(move, board);
            if (pick == 0) continue;

            if (baguni.size() == 0 || baguni.peek() != pick) {
                baguni.add(pick);
                continue;
            }

            baguni.pop();
            result += 2;
        }
        return result;
    }

    private int pickUp (int move, int[][] board) {
        move -= 1;
        int result = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][move] != 0) {
                result = board[i][move];
                board[i][move] = 0;
                break;
            }
        }

        return result;
    }
}
