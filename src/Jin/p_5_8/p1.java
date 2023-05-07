package Jin.p_5_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1 {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        boolean[] t = new boolean[30];
        for(int i = 0; i < 28; i++) t[Integer.parseInt(b.readLine()) - 1] = true;
        for(int i = 0; i < t.length; i++) if(!t[i]) System.out.println(i + 1);
    }
}
