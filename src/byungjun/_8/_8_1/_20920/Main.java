package byungjun._8._8_1._20920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");

        int alphaSize = Integer.parseInt(firstLine[0]);
        int length = Integer.parseInt(firstLine[1]);

        Map<String, Alpha> map = new HashMap<>();

        for (int i = 0; i < alphaSize; i++) {
            String line = br.readLine();

            if (line.length() < length) {
                continue;
            }

            if (map.containsKey(line)) {
                map.get(line).increaseCount();
            } else {
                map.put(line, new Alpha(line, 1));
            }
        }

        PriorityQueue<Alpha> pq = new PriorityQueue<>();

        for (Alpha alpha : map.values()) {
            pq.add(alpha);
        }

//        pq.addAll(map.values());

        StringBuilder sb = new StringBuilder();

        while (pq.size() > 0) {
            sb.append(pq.poll().word).append("\n");
        }

        System.out.println(sb);
    }

    static class Alpha implements Comparable<Alpha> {
        private String word;

        private int count;

        public Alpha (String word, int count) {
            this.word = word;
            this.count = count;
        }

        private void increaseCount () {
            count++;
        }

        public String getWord () {
            return word;
        }

        @Override
        public int compareTo(Alpha alpha) {
            int result = alpha.count - count;
            if (result != 0) {
                return result;
            }

            result = alpha.word.length() - word.length();
            if (result != 0) {
                return result;
            }

            return word.compareTo(alpha.word);

        }
    }
}
