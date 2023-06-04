package byungjun._5._5_31._4779;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static String[] dp = new String[13];
    private static String blank = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        dp[0] = "-";
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            if (line.equals("")) break;
            sb.append(recursion(Integer.parseInt(line))).append("\n");
        }

        System.out.println(sb.toString());
    }

    private static String recursion(int powNum) {
        if (dp[powNum] != null) {
            return dp[powNum];
        }

        StringBuffer sb = new StringBuffer();
        String sub = recursion(powNum-1);
        sb.append(sub);

        int blankSize = (int) Math.pow(3, powNum - 1);
        for (int i = 0; i < blankSize; i++) {
            sb.append(blank);
        }

        sb.append(sub);
        dp[powNum] = sb.toString();
        return dp[powNum];
    }
}
