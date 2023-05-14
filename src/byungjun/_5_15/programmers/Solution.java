package byungjun._5_15.programmers;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();

        char[] array = s.toCharArray();
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            char alpha = array[i];
            if (map.containsKey(alpha)) {
                result[i] = i - map.get(alpha);
            }else {
                result[i] = -1;
            }
            map.put(alpha, i);
        }

        return result;
    }
}