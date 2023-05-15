package yeah;

import java.util.Scanner;

public class _5_15 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //5줄...
    String[] str = new String[5];
    for (int i = 0; i < 5; i++) {
        str[i] = sc.nextLine();
    }
    //세로 읽기
    for (int i = 0; i < 15; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.print(str[j].charAt(i));
        }
    }
}
}
