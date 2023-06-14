package byungjun._6._6_14._14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[] nums;
    private static int[] operators = new int[4];;
    private static int max;
    private static int min;

    public static void main(String[] args) throws IOException {
        init();
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        int[] use = new int[4];
        for (int i = 0; i < operators.length; i++) {
            recursion(i, use, 1, nums[0]);
        }

        System.out.printf("%d\n%d%n", max, min);
    }

    public static void recursion(int operator, int[] use, int index, int result) {
        if (index >= nums.length) {
            max = Math.max(result, max);
            min = Math.min(result, min);
            return;
        }

        if (use[operator] >= operators[operator]) {
            return;
        }

        result = operation(result, nums[index], operator);
        use[operator]++;
        for (int i = 0; i < 4; i++) {
            recursion(i, use, index+1, result);
        }
        use[operator]--;
    }

    public static int operation (int left, int right, int operator) {
        switch (operator) {
            case 0 :
                return left + right;
            case 1 :
                return left - right;
            case 2 :
                return left * right;
            case 3 :
                return left / right;
            default:
                return left;
        }
    }

    public static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        //배열셋팅
        String[] secondLine = br.readLine().split(" ");
        nums = new int[secondLine.length];
        for (int i = 0; i < secondLine.length; i++) {
            nums[i] = Integer.parseInt(secondLine[i]);
        }

        String[] thirdLine = br.readLine().split(" ");
        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(thirdLine[i]);
        }
        br.close();
    }
}
