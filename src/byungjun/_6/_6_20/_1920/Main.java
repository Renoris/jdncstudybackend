package byungjun._6._6_20._1920;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static int[] array;
    private static int[] nums;

    public static void main(String[] args) throws IOException {
        read();

        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            if (Arrays.binarySearch(array, num) >= 0) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }

        }
        System.out.println(sb.toString());
    }


    public static void read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numLength = Integer.parseInt(br.readLine());
        array = new int[numLength];
        String[] secondLines = br.readLine().split(" ");
        for (int i = 0; i < numLength; i++) {
            array[i] = Integer.parseInt(secondLines[i]);
        }

        int arrayLength = Integer.parseInt(br.readLine());
        nums = new int[arrayLength];
        String[] fourthLines = br.readLine().split(" ");
        for (int i = 0; i < arrayLength; i++) {
            nums[i] = Integer.parseInt(fourthLines[i]);
        }
        Arrays.sort(array);
    }
}
