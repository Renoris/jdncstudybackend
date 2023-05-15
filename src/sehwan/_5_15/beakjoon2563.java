package sehwan._5_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon2563 {
    //도화지 역할을 할 100*100사이즈의 2차원 배열 board를 선언합니다.
    //다른 메소드에서 갖다쓰려고 그냥 static으로 선언하였습니다.
    public static boolean[][] board = new boolean[100][100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //각 색종이의 시작좌표(좌측하단)을 저장할 location배열과 총 면적을 저장할 result를 선언합니다.
        String[] location;
        int result = 0;
        //첫번째 입력값(색종이의 갯수)를 입력받습니다.
        int n = Integer.parseInt(br.readLine());

        //색종이의 갯수만큼 반복합니다.
        for(int i = 0; i < n; i++) {
            //색종이의 시작좌표를 저장합니다. location[0]은 x, location[1]은 y.
            location = br.readLine().split(" ");
            //색종이의 면적을 체크하는 메소드를 호출합니다. 매개변수로 x,y좌표를 넘겨줍니다.
            result += check(Integer.parseInt(location[0]) - 1, Integer.parseInt(location[1]) - 1);
        }

        System.out.println(result);
    }

    private static int check(int x, int y) {
        int result = 0;
        //색종이의 면적을 board배열에 체크하면서 동시에 카운트합니다.
        for(int i = x; i < x + 10; i++) {
           for(int j = y; j < y + 10; j++) {
               if(!board[i][j]) {
                   board[i][j] = true;
                   result++;
               }
           }
        }
        return result;
    }
}
