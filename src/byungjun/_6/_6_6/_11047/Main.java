package byungjun._6._6_6._11047;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int testcase = Integer.parseInt(line[0]);
        int goal = Integer.parseInt(line[1]);

        int[] coin = new int[testcase];
        int max = 0;
        int count = 0;
        for (int i = 0; i < testcase; i++) {
            coin[i] = Integer.parseInt(br.readLine());
            max = i;
            if (coin[i] > goal) {
                max--;
                break;
            }
        }

        for (int i = max; i >= 0; i--) {
            int use = goal / coin[i];
            goal -= (coin[i] * use);
            count += use;
            if (goal == 0) {
                break;
            }
        }
        System.out.println(count);
    }
}