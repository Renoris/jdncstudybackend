package sehwan._6._6_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon1149 {

    public static int temp = 0;
    public static int result;
    public static int[][] rgb;

    public static int n;
    public static int average;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        rgb = new int[n][3];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            rgb[i][0] = Integer.parseInt(st.nextToken());
            rgb[i][1] = Integer.parseInt(st.nextToken());
            rgb[i][2] = Integer.parseInt(st.nextToken());
            average += (rgb[i][0] + rgb[i][1] + rgb[i][2]) / 3;
        }

        result = average;

        getResult(0, -1);
        System.out.println(result);

    }

    private static void getResult(int house, int lastColor) {

        if(house == n) {
            if(result > temp) {
                result = temp;
            }
            return;
        }

        if(average <= temp) {
            return;
        }

        for(int j = 0; j < 3; j++) {
            if(j == lastColor) continue;

            temp += rgb[house][j];

            getResult(house + 1, j);
            temp -= rgb[house][j];
        }
    }
}
