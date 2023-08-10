package byungjun._8._8_8._13305;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int city = Integer.parseInt(br.readLine());

        String[] distanceStr = br.readLine().split(" ");
        long[] distance = new long[distanceStr.length];
        for (int i = 0; i < distanceStr.length; i++) {
            distance[i] = Long.parseLong(distanceStr[i]);
        }

        long min = 10000000001L;
        long count = 0;
        String[] costsStr = br.readLine().split(" ");
        for (int i = 0; i < costsStr.length - 1; i++) {
            long cost = Long.parseLong(costsStr[i]);
            if (min >= cost) {
                min = cost;
            }
            count += min * distance[i];
        }
        System.out.println(count);
    }
}