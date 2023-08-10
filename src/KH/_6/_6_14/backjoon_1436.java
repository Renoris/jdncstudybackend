package KH._6._6_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_1436 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++){
            int number = 666;
            while (true){
                if(Integer.toString(number).contains("666")){
                    num--;
                    if(num == 0){
                        System.out.println(number);
                        break;
                    }
                }
                number++;
            }
        }
    }
}
