package byungjun._6._6_13.programmers;

import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        int num = 0;
        for (int i = score.length - 1; i >= 0; i--) {
            num++;
            if (num == m) {
                num = 0;
                answer += m * score[i];
            }
        }

        return answer;
    }
}