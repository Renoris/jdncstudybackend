package KH._5._5_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon4779 {
    public static String cantor(int number){
        StringBuilder sb = new StringBuilder();
        if(number == 0){
            sb.append("-");
            return sb.toString();
        }
        else {
            sb.append(cantor(number-1));
            for(int i = 1; i <= Math.pow(3, number-1); i++){
                sb.append(" ");
            }
            sb.append(cantor(number-1));
            return sb.toString();
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while (true){
            input = br.readLine();
            if(input == null){
                break;
            }
            System.out.println(backjoon4779.cantor(Integer.parseInt(input)));
        }
    }
}
