package sehwan._6._6_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class beakjoon2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque deque = new ArrayDeque();

        for(int i = n; i > 0; i--) {
            deque.addFirst(i);
        }

        while(true) {
            if(deque.size() == 1) break;
            deque.pollFirst();
            deque.addLast(deque.pollFirst());
        }

        System.out.println(deque.pollFirst());
    }
}
