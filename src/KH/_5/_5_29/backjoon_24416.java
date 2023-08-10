package KH._5._5_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_24416 {
    static int fib = 1;
    static int fibonacci = 2;
    static int fib(int n) {

        if (n == 1 || n == 2){
            return n;
        }
        else{
            fib++;
            return fib(n-2) + fib(n-1);
        }

    }
    private static long fibonacci(int n) {
        long[] memo = new long[n + 1];

        memo[1] = 1;
        memo[2] = 1;
        for(int i = 3; i <= n-2; i++){
            fibonacci++;
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        fibonacci(input);
        fib(input);
        System.out.println(fib);
        System.out.println(fibonacci);
    }
}
