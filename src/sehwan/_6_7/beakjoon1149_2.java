package sehwan._6_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon1149_2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //지금꺼 = 이제까지 더한거 + 지금꺼1,2 중에 가장 작은거

        int smallest = getSmallest();
        System.out.println(smallest);
    }

    private static int getSmallest() {
        return 0;
    }
}
