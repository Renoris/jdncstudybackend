package sehwan._7._7_19;

import java.util.*;

public class Programmers13846 {
    public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

        int result = Solution(k, tangerine);

        System.out.println(result);
    }

    private static int Solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < tangerine.length; i++) {
            if(map.containsKey(tangerine[i])) {
                map.replace(tangerine[i], map.get(tangerine[i]) + 1);
            } else {
                map.put(tangerine[i], 1);
            }
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Comparator.reverseOrder());


        for(Integer value : list) {
            k -= value;
            answer++;
            if(k <= 0) break;
        }

        return answer;
    }
}
