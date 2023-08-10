package KH._6._6_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String star(int number){
        StringBuilder sb = new StringBuilder();
        if(number == 0){
            sb.append("*");
            return sb.toString();
        } else {
            for(int i = (int) Math.pow(2,number); i > 0; i++){
                for(int j = i; j > 0; j++){

                }
            }
            sb.append("*\n");
            return sb.toString();
        } /*else {
            sb.append(star(number-1));
//            for(int i = 1; i <= Math.pow(3, number-1); i++){
//                sb.append(" ");
//            }
//            sb.append(star(number-1));
            return sb.toString();
        }*/
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        System.out.println(star(number));
    }
}
