package Jin.p_5_22;

public class p2 {
    public static void main(String[] args) {
        p2_s sol = new p2_s();
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        int answer = sol.solution(board, moves);

        System.out.println(answer);
        ////어쩌고저쩌고
    }
}
