package sehwan._5_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon24416 {
    private static StringBuilder sb = new StringBuilder();
    private static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        fib(n);
        sb.append(count + " ");
        count = 0;

        fibonacchi(n);
        sb.append(count);

        System.out.println(sb);
    }

    private static int fib(int n) {
        if (n == 1 || n == 2) {
            count++;
            return 1;
        }
        else return (fib(n - 1) + fib(n - 2));
    }

    private static int fibonacchi(int n) {
        int[] f = new int[n];
        f[0] = 1;
        f[1] = 1;
        for(int i = 2; i < n; i++) {
            count++;
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n - 1];
    }
}
