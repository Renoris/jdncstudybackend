package sehwan._8_9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programmers42861 {
    public static void main(String[] args) {
        int n = 4;
        int[][] costs = {{0, 1, 1}, {0, 2, 2}, {1, 2, 5}, {1, 3, 1}, {2, 3, 8}};

        int answer = Solution(n, costs);

        System.out.println(answer);
    }


    /**
     * 최적해는 n - 1개의 다리를 가진다.
     * 다리가 하나도 없는 노드별로 하나씩 다리를 두고, 다리의 수가 n - 1개가 될때까지 코스트가 낮은것부터 하나씩 놓아본다.
     * 모든 노드가 연결되었는지 확인하는 메서드가 필요.
     */
    private static int Solution(int n, int[][] costs) {
        int answer = 0;

        int[][] bridge = new int[n - 1][];
        boolean check = linkCheck(bridge);

        return answer;
    }

    private static boolean linkCheck(int[][] bridge) {
        return false;
    }
}
