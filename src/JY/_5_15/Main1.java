package JY._5_15;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = sc.next();
//            System.out.println(words[i]);
        }


        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (j < words[i].length()) {
                    sb.append(words[i].charAt(j));
                }
            }
        }

        System.out.println(sb);
    }
}
