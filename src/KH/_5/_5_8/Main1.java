package KH._5._5_8;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[31];
        for(int i = 1; i <= 28; i++){
            int num = sc.nextInt();
            array[num] = num;
        }
        for(int i = 1; i <= 30; i++){
            if(array[i] == 0) System.out.println(i);
        }

    }


}
