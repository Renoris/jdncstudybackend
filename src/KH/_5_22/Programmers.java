package KH._5_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programmers {
    class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            int[] change = new int[moves.length];
            for(int i = 0; i < moves.length; i++){
                for(int j = 0; j < board.length; j++){
                    if(board[j][moves[i]-1] != 0){
                        change[i] = board[j][moves[i]-1];
                        board[j][moves[i]-1] = 0;
                        if(i > 0 && change[i] == change[i-1]){
                            change[i] = 0;
                            change[i-1] = 0;
                        }
                        if(i > 0 && change[i-1] < 1){
                            for(int k = i-1; k >= 0; k--){
                                if(change[k] > 0 ){
                                    if(change[i] == change[k]){
                                        change[i] = 0;
                                        change[k] = 0;
                                    }
                                    break;
                                }
                            }
                        }

                        break;
                    }
                    if(board[board.length-1][moves[i]-1] == 0){
                        change[i] = -1;
                    }
                }
            }
            for(int i = change.length-1; i >= 0; i--){
                if(change[i] == 0){
                    answer++;
                }
            }
            return answer;
        }

    }
    public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stMoves = br.readLine().split(" ");
        String[][] stBoard = new String[4][4];
//        br.close();
        int[][] board = new int[4][4];
        int[] moves = new int[4];
        for(int i = 0; i < stMoves.length; i++){
            moves[i] = Integer.parseInt(stMoves[i]);
        }
        for(int i = 0; i < stBoard.length; i++){
            stBoard[i] = br.readLine().split(" ");
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                board[i][j] = Integer.parseInt(stBoard[i][j]);
            }
        }
        Solution s = new Solution();
        System.out.println(s.solution(board,moves));
    }
}
/* input
1 5 3 5 1 2 4 4
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1

2 3 1 4 2 3
0 0 0 0
0 0 0 0
0 4 4 0
1 2 2 1

1 2 3 4
0 0 0 0
0 0 0 0
0 0 0 0
0 0 0 0
 */
