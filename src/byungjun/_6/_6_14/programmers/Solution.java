package byungjun._6._6_14.programmers;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : participant) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }

        return map.entrySet().stream().filter((set) -> set.getValue() == 1).findFirst().get().getKey();
    }
}