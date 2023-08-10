package KH._08_08;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] member = new int[n+1];
        for(int i = 1; i <= n; i++){
            member[i] = 1;
        }
        for(int i = 0; i < reserve.length; i++){
            member[reserve[i]] += 1;
        }
        for(int i = 0; i < lost.length; i++){
            member[lost[i]] -= 1;
        }
        for(int i = 1; i <= n; i++){
            if(i != 1 && member[i] == 0 && member[i-1] == 2){
                member[i-1] -= 1;
                member[i] += 1;
            }
            else if(i != n && member[i] == 0 && member[i+1] == 2){
                member[i+1] -= 1;
                member[i] += 1;
            }
        }
        for(int i = 1; i <= n; i++){
            if(member[i] > 0) answer++;
        }
        return answer;
    }
}
