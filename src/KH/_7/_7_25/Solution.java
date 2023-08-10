package KH._7._7_25;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        int rest = n;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < works.length; i++){
            pq.add(works[i]);
        }
        while(rest > 0){
            if(pq.peek() == 0) break;
            int dayWork = pq.poll();
            dayWork--;
            rest--;
            pq.add(dayWork);
        }
        while(pq.size() > 0){
            answer += Math.pow(pq.poll(), 2);
        }
        return answer;
    }
}
