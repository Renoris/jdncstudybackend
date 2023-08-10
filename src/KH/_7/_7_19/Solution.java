package KH._7._7_19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int number : tangerine){
            if(map.containsKey(number)){
                map.compute(number , (Integer key, Integer value) -> ++value);
            }
            else {
                map.put(number, 1);
            }
        }
        List<Integer> valueList = new ArrayList<>(map.values());
        Collections.sort(valueList, Collections.reverseOrder());
        int result = 0;
        for(Integer value : valueList){
            result += value;
            answer++;
            if(result >= k) break;
        }
        return answer;
    }
}
