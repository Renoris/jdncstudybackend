package byungjun._6._6_6._15651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int size;
    private static int[] array;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLines = br.readLine().split(" ");
        size = Integer.parseInt(firstLines[0]);
        array = new int[Integer.parseInt(firstLines[1])];
        for (int i = 1; i <= size; i++) {
            array[0] = i;
            check(1);
        }

        System.out.println(sb);
    }

    private static void check(int index) {
        if (index >= array.length) {
            for (int item : array) {
                sb.append(item).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= size; i++) {
            array[index] = i;
            check(index+1);
        }
    }
}
