package JY._5_8;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // 백준 10813번 공바꾸기
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        //  1~N번 까지 바구니
        int[] basket = new int[N];
        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        // 공을 M번 교환
        for (int i = 0; i < M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // x번 바구니의 공과 y번 바구니의 공 교환
            int trade = basket[x-1];
            basket[x-1] = basket[y-1];
            basket[y-1] = trade;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
