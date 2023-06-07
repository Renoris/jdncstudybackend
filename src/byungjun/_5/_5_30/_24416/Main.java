package byungjun._5._5_30._24416;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int[] dp;
    private static int functionCount1 = 0;
    private static int functionCount2 = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        dp = new int[size+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        fib(size);
        fibonacci(size);

        System.out.printf("%d %d", functionCount1, functionCount2);

    }
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            functionCount1++;
            return 1;
        }
        return (fib(n - 1) + fib(n - 2));
    }

    public static int fibonacci(int n) {
        if (dp[n] != 0) {
            return dp[n];
        }
        functionCount2++;
        dp[n] = fibonacci(n-1) + fibonacci(n - 2);
        return dp[n];
    }
}
