package KH._5_15;

public class Solution {
    public int[] solution(String s) {
        String[] input = s.split("");
        int[] answer = new int[input.length];
        answer[0] = -1;
        for(int i = input.length - 1; i > 0; i--){
            for(int j = i-1; j >= 0; j--){
                if(input[i].equals(input[j])){
                    answer[i] = i-j;
                    break;
                }
                else {
                    answer[i] = -1;
                }
            }
        }
        return answer;
    }
}
