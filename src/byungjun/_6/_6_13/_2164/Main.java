package byungjun._6._6_13._2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= num; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            queue.poll();
            queue.add(queue.poll());
        }

        System.out.println(queue.peek());
    }

}
