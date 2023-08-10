package sehwan._5._5_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //첫번째 줄을 입력받아 스플릿합니다. 첫번째 줄의 첫 숫자는 바구니의 갯수N, 두번째 숫자는 교환의 횟수 M입니다.
        String[] nm = br.readLine().split(" ");
        int[] bucket = new int[Integer.parseInt(nm[0])];
        int m = Integer.parseInt(nm[1]);

        //바구니에 교환용 값을 순차적으로 넣어줍니다.
        for(int i = 0; i < bucket.length; i++){
            bucket[i] = i + 1;
        }

        //두번째 입력부터 매 줄마다 스플릿하고 int형으로 변환하여 사용합니다.
        //임시 저장용 변수에 왼쪽 바구니의 값을 저장, 왼쪽바구니에 오른쪽바구니의 값을 저장, 오른쪽바구니에 저장용변수의 값을 저장하는 순서로 값을 교환합니다.
        int save = 0;
        for(int i = 0; i < m; i++){
            String[] split = br.readLine().split(" ");
            save = bucket[Integer.parseInt(split[0]) - 1];
            bucket[Integer.parseInt(split[0]) - 1] = bucket[Integer.parseInt(split[1]) - 1];
            bucket[Integer.parseInt(split[1]) - 1] = save;
        }

        //값을 모두 출력합니다.
        for(int i : bucket) sb.append(i).append(" ");
        System.out.println(sb);
    }
}

