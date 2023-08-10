package sehwan._6._6_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class beakjoon14888 {

    static String[] testCase;
    static int[] signs;
    static int[] relocation;
    static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        testCase = br.readLine().split(" ");
        String[] stringSigns = br.readLine().split(" ");
        signs = new int[stringSigns.length];

        for(int i = 0; i < 4; i++) {
            signs[i] = Integer.parseInt(stringSigns[i]);
        }

        relocation = new int[testCase.length - 1];

        makeRelocation(0);

        System.out.println(Collections.max(result));
        System.out.println(Collections.min(result));
    }

    private static void makeRelocation(int start) {
        if(start == relocation.length) {
            setMaxMin();
            return;
        }

        for(int i = start; i < relocation.length; i++) {
            for(int j = 0; j < 4; j++) {
                if(signs[j] != 0){
                    signs[j]--;
                    relocation[i] = j + 1;

                    makeRelocation(i + 1);
                    signs[j]++;
                    relocation[i] = 0;
                }
            }
            return;
        }
    }

    private static void setMaxMin() {
        int calc = Integer.parseInt(testCase[0]);
        for(int i = 0; i < relocation.length; i++) {
            calc = calculate(calc, relocation[i], i + 1);
        }
        result.add(calc);
    }

    private static int calculate(int calc, int sign, int i) {
        switch (sign) {
            case 1: calc += Integer.parseInt(testCase[i]); break;
            case 2: calc -= Integer.parseInt(testCase[i]); break;
            case 3: calc *= Integer.parseInt(testCase[i]); break;
            case 4: calc /= Integer.parseInt(testCase[i]); break;
        }

        return calc;
    }
}
