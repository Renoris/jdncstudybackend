package KH._5._5_15;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr ;
        String[] arr2 = new String[15];
        for(int i = 0; i < 5; i++){
            arr = sc.nextLine().split("");
            for(int j = 0; j < arr.length; j++){
                if(arr[j] != null){
                    if(arr2[j] == null){
                        arr2[j] = arr[j];
                    }
                    else {
                        arr2[j] += arr[j];
                    }
                }
            }
        }
        sc.close();
        for(int i = 0; i < arr2.length; i++){
            if(arr2[i] != null){
                System.out.print(arr2[i]);

            }
        }

    }
}
