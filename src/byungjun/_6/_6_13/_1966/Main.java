package byungjun._6._6_13._1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcNum = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tcNum; i++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            Queue<Node> queue = new LinkedList<>();

            String[] firstLine = br.readLine().split(" ");
            int index = Integer.parseInt(firstLine[1]);

            String[] secondLine = br.readLine().split(" ");
            for (int j = 0; j < secondLine.length; j++) {
                boolean want = j == index;
                int priority = Integer.parseInt(secondLine[j]);
                pq.add(priority);
                queue.add(new Node(priority, want));
            }

            int num = 0;
            while (pq.size() > 0) {
                boolean find = false;
                int priority = pq.poll();
                int queueSize = queue.size();
                for (int j = 0; j < queueSize; j++) {
                    Node node = queue.poll();
                    if (node == null) break;
                    if (node.priority >= priority) {
                
                        if (node.want) find = true;
                        num++;
                        break;
                    } else {
                        queue.add(node);
                    }
                }

                if (find) {
                    sb.append(num).append("\n");
                    break;
                }
            }
        }

        System.out.println(sb);
    }

    static class Node {
        int priority;
        boolean want;

        Node (int priority, boolean want) {
            this.priority = priority;
            this.want = want;
        }
    }
}
