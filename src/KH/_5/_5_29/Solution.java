package KH._5._5_29;
import java.util.Stack;
public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int number : nums){
            if(!stack.contains(number)){
                stack.push(number);
            }
        }
        return answer = nums.length/2 < stack.size() ? nums.length/2 : stack.size();
    }
}
