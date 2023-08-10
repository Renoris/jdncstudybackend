package KH._6._6_14;

import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        Queue<String> queue = new LinkedList<>();
        for(String st : completion){
            queue.offer(st);
        }
        for(String st : participant){
            for(int i = 0; i < queue.size(); i++){
                if(st.equals(queue.peek())){
                    st = "s";
                    queue.remove();
                    break;
                }
                else queue.offer(queue.poll());
            }
            if(!st.equals("s")) answer += st;
        }
        return answer;
    }
}
