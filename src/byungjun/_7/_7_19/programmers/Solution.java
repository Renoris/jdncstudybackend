package byungjun._7._7_19.programmers;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int[] tangerines) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int tangerine : tangerines) {
            if (map.containsKey(tangerine)) {
                map.put(tangerine, map.get(tangerine) + 1);
            } else {
                map.put(tangerine, 1);
            }
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        List<Integer> values = new ArrayList<>(keys.stream().map(map::get).collect(Collectors.toList()));

        Collections.sort(values);

        int sum = 0;
        int result = 0;
        for (Integer value : values) {
            result++;
            sum += value;
            if (sum >= k) {
                break;
            }
        }

        return result;
    }
}