package KH._7._7_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] number = br.readLine().split(" ");
        int hearNum = Integer.parseInt(number[0]);
        int seeNum = Integer.parseInt(number[1]);
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i < hearNum; i++){
            map.put(br.readLine(), 1);
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < seeNum; i++){
            String input = br.readLine();
            if(map.containsKey(input)){
                list.add(input);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
