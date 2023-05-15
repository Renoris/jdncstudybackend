package JY._5_15;


import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 색종이의 수
        int[][] paper = new int[101][101]; // 도화지 배열

        // 색종이 붙이기
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = y; j < y + 10; j++) {
                for (int k = x; k < x + 10; k++) {
                    paper[j][k] = 1; // 검은색 부분 표시
                }
            }
        }

        // 검은 영역의 넓이 구하기
        int area = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (paper[i][j] == 1) { // 검은색 부분인 경우
                    area++; // 넓이 증가
                }
            }
        }

        System.out.println(area); // 검은 영역의 넓이 출력
    }
}
