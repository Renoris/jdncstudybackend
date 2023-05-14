package byungjun._5_15._2563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        boolean[][] map = new boolean[100][100];

        for (int i = 0; i < tc; i++) {
            String[] point = br.readLine().split(" ");
            int x = Integer.parseInt(point[0]);
            int y = Integer.parseInt(point[1]);
            attach(x, y, map);
        }

        int result = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j]) result++;
            }
        }

        System.out.println(result);
    }

    public static void attach(int x, int y, boolean[][] map) {
        int goalX = x + 10;
        int goalY = y + 10;
        //색종이가 도화지 밖으로 나가는 경우는 없다
//        int goalX = Math.min(10 + x, 100);
//        int goalY = Math.min(10 + y, 100);

        for (int i = y; i < goalY; i++) {
            for (int j = x; j < goalX; j++) {
                if (!map[i][j]) map[i][j] = true;
            }
        }
    }

}
