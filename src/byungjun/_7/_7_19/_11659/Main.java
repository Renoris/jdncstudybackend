package byungjun._7._7_19._11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");

        int[] array = new int[Integer.parseInt(firstLine[0])];
        int tc = Integer.parseInt(firstLine[1]);

        int[] sum = new int[array.length];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            try {
                sum[i] = array[i]+sum[i-1];
            }catch (Exception e){
                sum[i] = array[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tc; i++) {
            st = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(st.nextToken()) - 2;
            int endIndex = Integer.parseInt(st.nextToken()) - 1;

            int endSum = sum[endIndex];
            int startSum = startIndex < 0 ? 0 : sum[startIndex];

            sb.append(endSum - startSum).append("\n");
        }

        System.out.println(sb);

    }
}
