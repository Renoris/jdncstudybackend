package byungjun._7._7_5.programmers;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(789));
    }

    public int solution(int storey) {
        int length = String.valueOf(storey).length();
        return recursion(storey, length);
    }

    private static int recursion (int number, int length) {
        if (number == 0) {
            return 0;
        }

        if (length == -1) {
            return 1;
        }

        int num = number%10;

        //upper
        int upperCount = 10-num;
        int upperNumber = (number + upperCount)/10;
        //lower
        int lowerCount = num;
        int lowerNumber = (number - lowerCount)/10;

        return Math.min(recursion(upperNumber, length - 1) + upperCount, recursion(lowerNumber, length - 1) + lowerCount);

    }

}