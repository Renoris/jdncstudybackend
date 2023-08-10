package KH._7._7_4;

public class Solution {
    public int solution(int storey) {
        int answer = 0;
        for(int i = storey; i > 0; i /= 10){
            if(i % 10 == 5 && (i/10 % 10) >=5){
                answer += 5;
                i += 10;
            }
            else if(i % 10 > 5){
                answer += 10 - (i % 10);
                i += 10;
            }
            else {
                answer += i % 10;
            }
        }
        return answer;
    }
}
