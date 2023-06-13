package KH._6_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        for(int i = 0; i <= input; i++){
            String[] test = br.readLine().split(" ");
            int num = Integer.parseInt(test[1]);
            String[] print = br.readLine().split(" ");
            Deque<String> deque = new ArrayDeque<>();
            int n = 0;
            boolean x = false;
            deque.add(print[num]);
            while (n < print.length && deque.size() < print.length){
                if(Integer.parseInt(print[num]) < Integer.parseInt(print[n])){
                    deque.add(print[n]);
                    x = true;
                    break;
                }
                n++;
            }
            n++;
            if(x){
                while (n < print.length){
                    if(Integer.parseInt(print[num]) <= Integer.parseInt(print[n])){
                        deque.add(print[n]);
                    }
                    n++;
                }
            }
            System.out.println(deque.size());
        }

    }
}
