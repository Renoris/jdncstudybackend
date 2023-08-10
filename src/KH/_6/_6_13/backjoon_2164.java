package KH._6._6_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class backjoon_2164 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        int input = Integer.parseInt(br.readLine());
        br.close();
        for(int i = 1; i <= input; i++){
            deque.add(i);
        }
        while(deque.size() != 1){
            deque.removeFirst();
            deque.add(deque.peek());
            deque.removeFirst();
        }
        System.out.println(deque.peek());
    }
}
