package byungjun._5_15._10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<char[]> list = new ArrayList<>();

        int max = 0;

        for (int i = 0; i < 5; i++) {
            char[] array = br.readLine().toCharArray();
            max = Math.max(array.length, max);
            list.add(array);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < list.size(); j++) {
                try{
                    sb.append(list.get(j)[i]);
                }catch (ArrayIndexOutOfBoundsException e) {
                    continue;
                }
            }
        }

        System.out.println(sb);
    }
}
