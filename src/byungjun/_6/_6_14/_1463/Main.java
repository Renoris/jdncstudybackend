package byungjun._6._6_14._1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int goal = Integer.parseInt(br.readLine());
        int result = 0;
        int num = 665;
        while (result < goal) {
            num++;
            if (String.valueOf(num).contains("666")) {
                result++;
            }
        }
        System.out.println(num);
    }
}
