package sehwan._5_31;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String s;
        for(int i = 0; i < n; i++) {
            s = Integer.toBinaryString(arr1[i] | arr2[i]);
            if(s.length() < n) {
                for(int j = s.length(); j < n; j++) {
                    s = "0" + s;
                }
            }
            s = s.replace("1", "#");
            s = s.replace("0", " ");
            answer[i] = s;
        }
        return answer;
    }
}
