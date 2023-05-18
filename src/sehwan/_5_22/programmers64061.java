package sehwan._5_22;

import java.util.Stack;

public class programmers64061 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        int answer = sol.solution(board, moves);

        System.out.println(answer);
    }
}

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> pick = new Stack<>();

        for(int i = 0; i < moves.length; i++) { //이동해야하는 수만큼 반복
            for(int j = 0; j < board.length; j++) { //board의 깊이만큼 반복
                if(board[j][moves[i] - 1] != 0) { //인형이 잡힐때까지 깊게 반복
                    if(pick.isEmpty()) { //저장된 인형이 없으면 바로 이동
                        pick.push(board[j][moves[i] - 1]);
                    }
                    else if(pick.peek().equals(board[j][moves[i] - 1])){ //아래의 인형과 같은거면 answer+1하고 제거
                        answer++;
                        pick.pop();
                    } else {
                        pick.push(board[j][moves[i] - 1]); //아래의 인형과 다르다면 이동
                    }

                    board[j][moves[i] - 1] = 0; //뽑힌 인형 board에서 제거

                    break;
                }
            }
        }

        return answer * 2;
    }
}
