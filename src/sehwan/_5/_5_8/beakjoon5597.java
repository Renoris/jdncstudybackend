package sehwan._5._5_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon5597 {
    public static void main(String[] args) throws IOException {
        //교실에 30명이니까 30
        boolean[] check = new boolean[30];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //제출한 28의 명단을 입력받음
        for(int i = 0; i < 28; i++){
            check[Integer.parseInt(br.readLine()) - 1] = true;
        }

        //제출 안한사람 찾기
        for(int i = 0; i < check.length; i++){
            if(!check[i]) System.out.println(i + 1);;
        }
    }
}
