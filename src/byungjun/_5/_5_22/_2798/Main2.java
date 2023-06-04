package byungjun._5._5_22._2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {
    private static int result;
    private static int[] array;
    private static int goal;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");

        goal = Integer.parseInt(firstLine[1]);
        result = 0;
        array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            check(i, 1, array[i]);
        }

        System.out.println(result);
    }

    /**
     * 
     * @param index : 카드를 뽑을 array의 위치
     * @param count : 현재까지 몇개의 카드를 뽑앗나
     * @param sum : 현재까지 뽑은 카드의 합
     */
    public static void check(int index, int count, int sum) {
        if (sum > goal) return;
        if (count == 3) {
            result = Math.max(sum, result);
            return;
        }
        for (int i = index + 1; i < array.length; i++) {
            int newSum = sum + array[i];
            if (newSum > goal) {
                break;
            }
            check(i, count+1, newSum);
        }
    }
}
