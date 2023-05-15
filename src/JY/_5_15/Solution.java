package JY._5_15;

import java.util.Arrays;
class Solution {
    public int[] solution(String s) {

        String[] arr = s.split("");

        int[] answer = new int[s.length()];
        Arrays.fill(answer, -1);

        for (int i = 0; i < s.length(); i++) {
            int x = -1;
            for (int j = 0; j < i; j++) {
                if (arr[i].equals(arr[j])) {
                    x = j;
                }
            }
            if (x >= 0) {
                answer[i] = i - x;
            }
        }
        return answer;
    }
}
