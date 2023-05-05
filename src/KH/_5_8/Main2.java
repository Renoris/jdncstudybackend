package KH._5_8;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] array;
        String[] firstArray = sc.nextLine().split(" ");
        int bucket = Integer.parseInt(firstArray[0]);
        int changes = Integer.parseInt(firstArray[1]);
        int[] bucketNum = new int[bucket+1];
        int[][] changeNum = new int[changes+1][2];
        for(int i = 1; i <= changes; i++){
            array = sc.nextLine().split(" ");
            changeNum[i][0] = Integer.parseInt(array[0]);
            changeNum[i][1] = Integer.parseInt(array[1]);
        }
        for(int i = 0; i < bucket+1; i++){
            bucketNum[i] = i;
        }
        for(int i = 1; i <= changes; i++){
            int a = bucketNum[changeNum[i][0]];
            int b = bucketNum[changeNum[i][1]];
            bucketNum[changeNum[i][0]] = b;
            bucketNum[changeNum[i][1]] = a;
        }

        for(int i = 1; i <= bucket; i++){
            System.out.print(bucketNum[i]+" ");
        }


    }
}
