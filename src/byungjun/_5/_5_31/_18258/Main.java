package byungjun._5._5_31._18258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < tc; i++) {
            String[] order = br.readLine().split(" ");
            try{
                switch (order[0]) {
                    case "push" :
                        deque.add(Integer.parseInt(order[1]));
                        break;
                    case "front" :
                        sb.append(deque.getFirst()).append("\n");
                        break;
                    case "pop" :
                        sb.append(deque.pop()).append("\n");
                        break;
                    case "size" :
                        sb.append(deque.size()).append("\n");
                        break;
                    case "back" :
                        sb.append(deque.getLast()).append("\n");
                        break;
                    case "empty" :
                        sb.append(deque.size() > 0 ? "0" : "1").append("\n");

                }
            }catch (NoSuchElementException e) {
                sb.append("-1").append("\n");
            }

        }
        System.out.println(sb.toString());
    }
}
