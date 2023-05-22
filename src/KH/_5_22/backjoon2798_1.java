package KH._5_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon2798_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int count = Integer.parseInt(input[0]);
        int base = Integer.parseInt(input[1]);
        String[] arr = br.readLine().split(" ");
        int[] numArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            numArr[i] = Integer.parseInt(arr[i]);
        }
        int result = 0;
        for(int i = 0; i < count -2; i++){
            for(int j = i+1; j < count -1; j++){
                for(int k = j+1; k < count; k++){
                    int sum = numArr[i]+numArr[j]+numArr[k];
                    if(result == base) break;
                    else if (sum > result && sum <= base) {
                        result = sum;
                    }
                }
                if(result == base) break;
            }
            if(result == base) break;
        }
        System.out.println(result);
    }
}
