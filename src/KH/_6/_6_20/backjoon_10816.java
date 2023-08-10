package KH._6._6_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class backjoon_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        String[] number = br.readLine().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String input : num){
            if(map.containsKey(input)){
                map.put(input, map.compute(input,((s, integer) -> integer + 1)));
            }
            else {
                map.put(input, 1);
            }
        }
        for(String strings : number){
            if (map.containsKey(strings)) {
                sb.append(map.get(strings));
            }
            else {
                sb.append("0");
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
