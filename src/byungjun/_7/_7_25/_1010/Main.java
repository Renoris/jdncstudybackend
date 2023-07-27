package byungjun._7._7_25._1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            String[] line = br.readLine().split(" ");
            int left = Integer.parseInt(line[0]);
            int right = Integer.parseInt(line[1]);
            
            BigInteger height = BigInteger.ONE;
            for (int j = right; j > left; j--) {
                height = height.multiply(BigInteger.valueOf(j));
            }
            
            BigInteger low = BigInteger.ONE;
            for (int j = 1; j <= right - left; j++) {
                low = low.multiply(BigInteger.valueOf(j));
            }

            sb.append(height.divide(low)).append("\n");
        }
        System.out.println(sb);
    }
}

