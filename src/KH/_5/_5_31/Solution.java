package KH._5._5_31;
import java.util.Stack;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[][] arrS = new String[n][n];
        for(int i = 0; i < n; i++){
            Stack<String> stack1 = new Stack<>();
            Stack<String> stack2 = new Stack<>();
            StringBuilder sb = new StringBuilder();
            String[] bs1 = Integer.toBinaryString(arr1[i]).split("");
            String[] bs2 = Integer.toBinaryString(arr2[i]).split("");
            for(String st1 : bs1){
                stack1.push(st1);
            }
            for(String st2 : bs2){
                stack2.push(st2);
            }
            for(int j = n-1; j >= 0; j--){
                if(stack1.size() != 0){
                    arrS[i][j] = stack1.peek().equals("1") ? "#" : " ";
                    stack1.pop();
                } else {
                    arrS[i][j] = " ";
                }
                if(stack2.size() != 0){
                    if(arrS[i][j].equals("#")){
                        stack2.pop();
                    } else {
                        arrS[i][j] = stack2.peek().equals("1") ? "#" : " ";
                        stack2.pop();
                    }
                }
            }
            for(int k = 0; k < n; k++){
                sb.append(arrS[i][k]);
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}
