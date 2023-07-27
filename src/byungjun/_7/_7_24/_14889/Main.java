package byungjun._7._7_24._14889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static int[][] map;
    private static int size;
    private static int min;

    public static void main(String[] args) throws IOException {
        read();

        boolean[] check = new boolean[size];

        for (int i = 0; i < size; i++) {
            recursion(i, 0, check);
        }

        System.out.println(min);
    }

    public static void recursion(int index, int count, boolean[] check) {
        check[index] = true;
        count++;
        if (count == size/2) {
            int aTeam = 0;
            int bTeam = 0;

            for (int i = 0; i < size; i++) {
                if (check[i]) aTeam += getSynergy(i, check);
                else bTeam += getSynergy(i, check);
            }

            min = Math.min(Math.abs(aTeam - bTeam), min);
            check[index] = false;
            return;
        }

        for (int i = index + 1; i < size; i++) {
            recursion(i, count, check);
        }

        check[index] = false;
    }

    private static int getSynergy(int index, boolean[] array) {
        int result = 0;

        boolean me = array[index];

        for (int i = 0; i < array.length; i++) {
            if (i == index) continue;
            if (array[i] != me) continue;
            result += map[index][i];
        }

        return result;
    }

    public static void read () throws IOException {
        min = Integer.MAX_VALUE;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());

        map = new int[size][size];

        for (int i = 0; i < size; i++) {
            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        br.close();
    }
}

