package byungjun._8._8_9._11399;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        String[] line = br.readLine().split(" ");
        int count = 0;
        int total = 0;
        for (int i = 0; i < num; i++) {
            pq.offer(Integer.parseInt(line[i]));
        }

        while (!pq.isEmpty()) {
            int get = pq.poll();
            count += total + get;
            total += get;
        }
        System.out.println(count);
    }
}