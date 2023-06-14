package sehwan._6_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int count = 0;
        int now = 666;

        while (true) {
            if (String.valueOf(now).contains("666") == true) {
                count++;
            }

            if (count == num) {
                break;
            }

            now++;
        }

        System.out.println(now);

    }
}
