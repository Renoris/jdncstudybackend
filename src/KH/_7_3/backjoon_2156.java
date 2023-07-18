package KH._7_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_2156 {
    public static int MaxWine(int n, int[] wine){
        int[] maxWine = new int[n];
        maxWine[1] = wine[1];
        if(n > 1){

            maxWine[2] = wine[1] + wine[2];
        }
        for(int i = 3; i < n; i++){
            maxWine[i] = Math.max(maxWine[i-1], Math.max(maxWine[i-2], maxWine[i-3] + wine[i-1]) + wine[i]);
        }
        return maxWine[n-1];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine())+1;
        int[] wine = new int[n];
        for(int i = 1; i < n; i++){
            wine[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(MaxWine(n, wine));
    }
}
