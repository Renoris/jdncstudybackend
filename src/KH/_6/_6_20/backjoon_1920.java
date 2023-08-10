package KH._6._6_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class backjoon_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] in = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        String[] compare = br.readLine().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String input : in){
            map.put(input, 0);
        }
        for(String input : compare){
            if(map.containsKey(input)){
                sb.append("1").append("\n");
            }
            else {
                sb.append("0").append("\n");
            }
        }
        System.out.println(sb);
    }
}
