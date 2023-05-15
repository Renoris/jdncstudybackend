package JY._5_15;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] arr = s.split("");
//        System.out.println(Arrays.toString(arr));

        int[] answer = new int[s.length()];
        Arrays.fill(answer, -1);
//        System.out.println(Arrays.toString(answer));

        for (int i = 0; i < s.length(); i++) {
            int x = -1;
            for (int j = 0; j < i; j++) {
                if (arr[i].equals(arr[j])) {
                    x = j;
                }
            }
            if (x >= 0) {
                answer[i] = i - x;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
