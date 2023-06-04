package byungjun._5._5_8;

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