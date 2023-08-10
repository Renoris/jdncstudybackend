package byungjun._8._8_8.programmers;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        Set<Integer> lostSet = new HashSet<>();

        for (int lostStudent : lost) {
            lostSet.add(lostStudent);
        }

        Set<Integer> reserveSet = new HashSet<>();
        for (int reserveStudent : reserve) {
            if (lostSet.contains(reserveStudent)) lostSet.remove(reserveStudent);
            else reserveSet.add(reserveStudent);
        }

        int noWear = 0;

        for (int i = 1; i <= n; i++) {
            if (lostSet.contains(i)) {
                if (reserveSet.contains(i-1)) {
                    reserveSet.remove(i-1);
                } else if (reserveSet.contains(i+1)) {
                    reserveSet.remove(i+1);
                } else {
                    noWear++;
                }
            }
        }

        return n - noWear;
    }
}
