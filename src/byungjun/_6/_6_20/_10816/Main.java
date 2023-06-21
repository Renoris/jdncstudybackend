package byungjun._6._6_20._10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static int[] finder;

    private static Map<Integer, Integer> cards;

    public static void main(String[] args) throws IOException {
        read();
        StringBuilder sb = new StringBuilder();
        Arrays.stream(finder).forEach(
            (item) -> {
                Integer integer = cards.get(item);
                if (integer != null) {
                    sb.append(integer).append(" ");
                } else {
                    sb.append("0").append(" ");
                }
            }
        );

        System.out.println(sb);
    }


    public static void read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        String[] secondLines = br.readLine().split(" ");
        cards = new HashMap<>();
        for (String secondLine : secondLines) {
            int cardNum = Integer.parseInt(secondLine);
            if (cards.containsKey(cardNum)) {
                cards.put(cardNum, cards.get(cardNum) + 1);
            } else {
                cards.put(cardNum, 1);
            }
        }

        int size = Integer.parseInt(br.readLine());
        finder = new int[size];
        String[] fourLines = br.readLine().split(" ");
        for (int i = 0; i < fourLines.length; i++) {
            finder[i] = Integer.parseInt(fourLines[i]);
        }
    }
}
