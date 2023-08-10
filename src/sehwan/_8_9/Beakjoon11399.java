package sehwan._8_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Beakjoon11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        List<Integer> testcase = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            testcase.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(testcase);

        int result = 0;
        for(int i : testcase) {
            result += i * n;
            n--;
        }

        System.out.println(result);
    }
}
