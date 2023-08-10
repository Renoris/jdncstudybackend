package KH._6._6_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        for(int i = 0; i < input; i++){
            String[] test = br.readLine().split(" ");
            int num = Integer.parseInt(test[1]);
            String[] print = br.readLine().split(" ");
            Deque<String> deque = new ArrayDeque<>();
            int n = 0;
            int count = 0;
            int target = Integer.parseInt(print[num]);
            boolean check = false;
//            deque.add(print[num]);
            for(String s : print){
                deque.add(s);
                if(Integer.parseInt(s) > n) n = Integer.parseInt(s);
            }
            for(int j = n; j > 0; j--){
                for(int k = 0; k < deque.size(); k++){
                    if(num != 0){
                        if(Integer.parseInt(deque.peek()) == j ){
                            deque.pop();
                            count++;
                            num--;
                        } else {
                            deque.add(deque.pop());
                            num--;
                        }
                    } else {
                        if(Integer.parseInt(deque.peek()) == j ){
                            deque.pop();
                            count++;
                            check = true;
                            break;
                        } else {
                            deque.add(deque.pop());
                            num = deque.size();
                        }
                    }
                }
                if(check) break;
            }
            System.out.println(count);
        }

    }
}
