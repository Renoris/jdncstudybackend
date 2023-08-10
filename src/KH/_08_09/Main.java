package KH._08_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        int[] time = new int[N];
        for(int i = 0; i < time.length; i++){
            time[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time);
        for(int i = 0; i < time.length; i++){
            result += time[i] * (time.length - i);
        }
        System.out.println(result);
    }
}
