package sehwan._7._7_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon14889 {

    public static int needPeople;
    public static int n;
    public static int[][] sum;
    public static boolean[] check;
    public static int result = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        sum = new int[n][n];
        for(int i = 0; i < n; i++) { //능력치 표를 입력받습니다.
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                sum[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //대각선을 기준으로 더해줍니다.(1,4와 4,1의 시너지는 어차피 함께하기 때문)
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                sum[j][i] += sum[i][j];
            }
        }

        check = new boolean[n];
        check[0] = true;

        int start = 1;
        //순서대로 팀을 짜기
        // (n / 2) - 1 == 한 팀의 팀원 수(플레이어 1 제외)
        // 팀은 크게 두가지가 있습니다. 1이 포함된 팀이냐, 포함되지 않은 팀이냐..
        needPeople = (n / 2) - 1;
        makeTeam(start, 0);

        System.out.println(result);
    }

    private static void makeTeam(int start, int getCount) {
        int count = getCount;

        if(count == needPeople) {
            makeResult();
            return;
        }

        for(int i = start; i < n; i++) {
            check[i] = true;
            makeTeam(i + 1, count + 1);
            check[i] = false;
        }
    }

    private static void makeResult() {
        int[] teamA = new int[needPeople + 1];
        int[] teamB = new int[needPeople + 1];

        int countA = 0;
        int countB = 0;
        int teamASum = 0;
        int teamBSum = 0;
        for(int i = 0; i < n; i++) {
            if(check[i] == true) {
                teamA[countA++] = i;
            } else {
                teamB[countB++] = i;
            }
        }

        for(int i = 0; i < needPeople; i++) {
            for(int j = i; j < needPeople + 1; j++) {
                teamASum += sum[teamA[i]][teamA[j]];
                teamBSum += sum[teamB[i]][teamB[j]];
            }
        }

        int temp = Math.abs(teamASum - teamBSum);
        if(result > temp) result = temp;
    }
}
