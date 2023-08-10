package KH._6._6_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon11047 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int num = Integer.parseInt(input[0]);
        int money = Integer.parseInt(input[1]);
        int result = 0;
        int[] coin = new int[num];
        for(int i = 0; i < num; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }
        while (money != 0){
            for(int j = num-1; j >= 0; j--){
                if(coin[j] <= money){
                    money -= coin[j];
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
