package byungjun._5._5_22.programmers;


public class Solution2 {

    private int[] array;
    private int lastIndex;
    private int result;

    public int solution(int[][] board, int[] moves) {
        array = new int[moves.length];
        lastIndex = 0;
        result = 0;

        for (int i = 0; i < moves.length; i++) {
            int move = moves[i] - 1;
            pickUp(move, board);
        }

        return result;
    }

    public void pickUp(int move, int[][] board) {
        for (int i = 0; i < board[move].length; i++) {
            if (board[i][move] != 0) {
                int doll = board[i][move];
                board[i][move] = 0;
                array[lastIndex] = doll;

                if (lastIndex - 1 >= 0 && array[lastIndex] == array[lastIndex-1]) {
                    lastIndex -= 2;
                    result += 2;
                }

                lastIndex++;


                break;
            }
        }
    }
}
