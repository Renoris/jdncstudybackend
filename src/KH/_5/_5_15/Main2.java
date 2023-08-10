package KH._5._5_15;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int[][] arr = new int[101][101];
        int sum = 0;
        for(int i = 0; i < Integer.parseInt(num); i++){
            String[] point = sc.nextLine().split(" ");
            int base = Integer.parseInt(point[0]);
            int height = Integer.parseInt(point[1]);;
            for(int j = base; j < base+10; j++){
                for(int k = height; k < height+10; k++){
                    arr[j][k] = 1;
                }
            }
        }
        for(int i = 0; i < 101; i++){
            for(int j = 0; j < 101; j++){
                if(arr[i][j] == 1) sum++;
            }
        }
        System.out.println(sum);
    }
}
