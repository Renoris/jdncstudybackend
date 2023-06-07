package byungjun._5._5_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] array = new boolean[30];

        for (int i = 0; i < 28; i++) {
            array[Integer.parseInt(br.readLine()) -1] = true;
        }

        int num1 = 0;
        int num2 = 0;
        for (int i = 29; i >= 0; i--) {
            if (!array[i]) {
                num2 = num1;
                num1 = i + 1;
            }
        }

        System.out.println(num1);
        System.out.println(num2);
    }
}
