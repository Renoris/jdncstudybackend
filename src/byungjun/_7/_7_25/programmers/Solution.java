package byungjun._7._7_25.programmers;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {4,3,3};
        solution.solution(4, array);
    }

    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int work : works) {
             pq.add(work);
        }

        while (n > 0) {
            int item = pq.poll() - 1;
            pq.add(item > 0 ? item : 0);
            n--;
        }

        long result = 0;
        while (pq.size() > 0) {
            result += Math.pow(pq.poll(), 2);
        }

        return result;
    }
}