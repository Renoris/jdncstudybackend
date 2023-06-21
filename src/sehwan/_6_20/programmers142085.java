package sehwan._6_20;

import java.util.Arrays;

public class programmers142085 {
    public static void main(String[] args) {
        int n = 3;
        int k = 3;
        int[] enemy = {4, 2, 4, 5, 3, 3, 1};

        int answer = solution(n, k, enemy);
        System.out.println(answer);
    }

    private static int[] tc;
    private static int maxStage;
    private static int solution(int n, int k, int[] enemy) {
        int answer = 0;
        maxStage = answer;
        tc = enemy;

        if(k >= tc.length) return tc.length;

        getResult(n, k, 1);
        answer = maxStage;

        return answer;
    }

    private static void getResult(int n, int k, int c) {
        int soldier = n;
        int pass = k;
        int count = c;

        if(count - 1 == tc.length) { //마지막 라운드까지 도달했으면
            maxStage = tc.length;
            return;
        }
        if(pass == 0 && soldier < tc[c - 1]) {
            if(maxStage < count) maxStage = count;
            return;
        }

        for(int i = c - 1; i < tc.length; i++) {
            //무적권 썼을때
            if(pass > 0) {
                pass--;
                count++;
                getResult(soldier, pass, count);
                pass++;
                count--;
            }

            //병사를 썼을때
            if(soldier >= tc[i]) {
                soldier -= tc[i];
                count++;
                getResult(soldier, pass, count);

            }
        }
    }
}
