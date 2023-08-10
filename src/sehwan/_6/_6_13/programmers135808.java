package sehwan._6._6_13;

import java.util.Arrays;

public class programmers135808 {
    public static void main(String[] args) {
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        int result = Solution(k, m, score);
        System.out.println(result);
    }

    private static int Solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);
        for(int i = score.length - 1; i >= 0; i--) {
            i -= m - 1;
            if(i < 0) break;
            answer += score[i] * m;
        }

        return answer;
    }
}
