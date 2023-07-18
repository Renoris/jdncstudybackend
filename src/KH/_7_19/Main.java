package KH._7_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputNum = br.readLine().split(" ");
        int N = Integer.parseInt(inputNum[0]);
        int M = Integer.parseInt(inputNum[1]);
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] number = new int[N];
        for(int i  = 0; i < N; i++){
            if(i == 0){
                number[i] = Integer.parseInt(stk.nextToken());
            }
            else {
                number[i] = number[i-1] + Integer.parseInt(stk.nextToken());
            }
        }
        for(int j = 0; j < M; j++){
            String[] input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);
            if(start == 1) {
                System.out.println(number[end-1]);
            }
            else {
                System.out.println(number[end-1] - number[start-2]);
            }
        }
    }
}
