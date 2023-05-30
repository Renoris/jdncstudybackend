package byungjun._5_30.ponketmon;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int take = nums.length/2;
        int spices = set.size();
        if (take > spices) {
            take = spices;
        }
        return take;
    }

    private int combinationSize (int spices, int take) {
        return getFactorial(spices)/(getFactorial(spices-take) * getFactorial(take));
    }

    private int getFactorial(int num) {
        int result = 1;
        for (int i = num; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}