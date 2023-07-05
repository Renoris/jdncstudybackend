package byungjun._7._7_4.programmers;

import java.util.Arrays;

class Solution {

    private int maxX;
    private int maxY;
    private int nowX;
    private int nowY;

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [][] array = new int[][] {{1,1}};
        solution.solution(10, 10, 2, 2, array);
    }

    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        maxX = m;
        maxY = n;
        nowX = startX;
        nowY = startY;

        int[] result = new int[balls.length];

        Arrays.fill(result, Integer.MAX_VALUE);

        for (int i = 0; i < balls.length; i++) {
            int x = balls[i][0];
            int y = balls[i][1];
            for (int j = 0; j < 4; j++) {
                int a =  cushion(x, y, j);
                result[i] = Math.min(a, result[i]);
            }
        }

        return result;

    }

    private int cushion (int x, int y, int direction) {
        return switch (direction) {
            case 0 -> //오른쪽
                cushionRight(x, y);
            case 1 -> //아래
                cushionDown(x, y);
            case 2 -> //왼쪽
                cushionLeft(x, y);
            case 3 ->//위
                cushionUp(x, y);
            default -> 0;
        };
    }


    private int cushionLeft(int x, int y) {
        if (y == nowY && x < nowX) return Integer.MAX_VALUE;
        return square(x+ nowX) + square(subtractAbs(y, nowY));
    }

    private int cushionRight(int x, int y) {
        if (y == nowY && x > nowX) return Integer.MAX_VALUE;
        return square(maxX * 2 - nowX - x) + square(subtractAbs(y, nowY));
    }

    private int cushionUp(int x, int y) {
        if (x == nowX && y > nowY) return Integer.MAX_VALUE;

        return square(maxY * 2 - y - nowY) + square(subtractAbs(x, nowX));
    }

    private int cushionDown(int x, int y) {
        if (x == nowX && y < nowY) return Integer.MAX_VALUE;
        return square(y + nowY) + square(subtractAbs(x, nowX));
    }

    private int square (int num) {
        return (int) Math.pow(num, 2);
    }

    private int subtractAbs(int first, int second) {
        return Math.abs(first - second);
    }
}