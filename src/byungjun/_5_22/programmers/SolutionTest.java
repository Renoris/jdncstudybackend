package byungjun._5_22.programmers;

public class SolutionTest {
    public static void main(String[] args) {
        int[][] array = new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = new int[] {1,5,3,5,1,2,1,4};
        Solution solution = new Solution();
        System.out.println(solution.solution(array, moves));
    }

}
