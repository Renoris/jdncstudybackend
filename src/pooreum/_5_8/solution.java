package pooreum._5_8;


class solution {
    public static void main(String[] args) {

    }

    public int Solution(int[] numbers, int n) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        if (answer > n) {
            return answer;
        }


    }
}




