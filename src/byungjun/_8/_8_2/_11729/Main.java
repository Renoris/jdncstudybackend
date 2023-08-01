package byungjun._8._8_2._11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static StringBuilder sb;

    private static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        result = 0;
        sb = new StringBuilder();

        move(1, 3, size);
        System.out.println(result);
        System.out.println(sb);
    }

    private static void move (int from, int to, int size) {
        if (size == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            result++;
            return;
        }

        int middle = 6 - (from + to);

        //자기 위에껄 전부 middle로 보내고
        move (from, middle, size - 1);

        //자신을 to로 보내고
        sb.append(from).append(" ").append(to).append("\n");
        result++;

        //middle로 보낸 위에껄 다시 to로
        move (middle, to, size - 1);

    }
}
