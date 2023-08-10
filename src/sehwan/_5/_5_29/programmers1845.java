package sehwan._5._5_29;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class programmers1845 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        System.out.println(Solution(nums));
    }

    private static int Solution(int[] nums) {
        int answer = 0;
        Integer[] nums2 = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
        }

        Set set = new HashSet<Integer>(Arrays.asList(nums2));
        int setSize = set.size();
        int getNum = nums.length / 2;

        if(setSize < getNum) answer = setSize;
        else answer = getNum;
        return answer;
    }
}
