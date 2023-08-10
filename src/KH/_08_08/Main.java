package KH._08_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine())-1;
        long[] length = new long[N];
        long[] price = new long[N];
        long totalPrice = 0;
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            length[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            price[i] = Integer.parseInt(st.nextToken());
        }
        long nowPrice = price[0];
        for(int i = 0; i < N; i++){
            if(nowPrice >= price[i]){
                nowPrice = price[i];
            }
            totalPrice += nowPrice * length[i];
        }
        System.out.println(totalPrice);
    }
}
