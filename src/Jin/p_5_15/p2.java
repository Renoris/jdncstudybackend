package Jin.p_5_15;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2 {
    /*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] board = new boolean[100][100];
        int result = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] location = br.readLine().split(" ");
            int x = Integer.parseInt(location[0]);
            int y = Integer.parseInt(location[1]);
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!board[j][k]) {
                        board[j][k] = true;
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] b = new boolean[100][100];
        int x = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] lo = br.readLine().split(" ");
            x += p(b, Integer.parseInt(lo[0]), Integer.parseInt(lo[1]));
        }
        System.out.println(x);
    }

    private static int p(boolean[][] lo, int x, int y) {
        int z = 0;
        for (int i = x; i < x + 10; i++) {
            for (int j = y; j < y + 10; j++) {
                if (!lo[i][j]) {
                    lo[i][j] = true;
                    z++;
                }
            }
        }
        return z;
    }
}

