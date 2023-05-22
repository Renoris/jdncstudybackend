package byungjun._5_22.programmers;

public class SolutionTest {
    public static void main(String[] args) {
        int[][] array = new int[][] {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 4, 4, 0}, {1, 2, 2, 1}};
        int[] moves = new int[] {2, 3, 1, 4, 2, 3};
        Solution2 solution = new Solution2();
        System.out.println(solution.solution(array, moves));
    }

}
