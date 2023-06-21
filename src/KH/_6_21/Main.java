package KH._6_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] number = br.readLine().split(" ");
        int k = Integer.parseInt(number[0]);
        int n = Integer.parseInt(number[1]);
        int[] cables = new int[k];
        long mid = 0;
        long max = 0;
        long min = 1;
        for(int i = 0; i < k; i++){
            cables[i] = Integer.parseInt(br.readLine());
            max += cables[i];
        }
        max /= n;

        while(true){
            int cableNum = 0;
            mid = (max + min)/2;
            if (mid == min) {
                break;
            }
            for(int cable : cables){
                cableNum += cable/mid;
            }
            if(cableNum > n - 1) {
                min = mid;
            }
            else {
                max = mid;
            }

//            if(cableNum == n-1){
//                while (true){
//                    cableNum = 0;
//                    for(int cable : cables){
//                        cableNum += cable/mid;
//                    }
//                    if(cableNum != n-1) {
//                        notFound = false;
//                        break;
//                    }
//                    mid--;
//                }
//            }
        }
        while (true) {
            int cableNum = 0;
            for(int cable : cables){
                cableNum += cable/mid;
            }
            if (cableNum != n-1) {
                break;
            }
            mid--;
        }

        System.out.println(mid);
    }
}
