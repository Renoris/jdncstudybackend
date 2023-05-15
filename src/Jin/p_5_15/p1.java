package Jin.p_5_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] words = new String[5];
        StringBuilder sb = new StringBuilder();
        int maxLength = 0;

        for (int i = 0; i < 5; i++) words[i] = br.readLine().trim();
        for (String word : words)maxLength = Math.max(maxLength, word.length());

        for (int i = 0; i < maxLength; i++) {
            for (String word : words) {
                if (word.length() > i)sb.append(word.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}
