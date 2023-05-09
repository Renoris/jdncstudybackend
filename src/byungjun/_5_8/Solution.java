package byungjun._5_8;

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers, int n) {
        int result = 0;

        for(int number : numbers) {
            if (result <= n) result += number;
            else return result;
        }

        return result;
    }
}