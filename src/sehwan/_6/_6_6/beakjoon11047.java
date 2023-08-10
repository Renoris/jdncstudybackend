

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class beakjoon11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        int tempValue = 0;
        for(int i = 0; i < n; i++) {
            tempValue = Integer.parseInt(br.readLine());
            if(tempValue > k) break;
            list.add(tempValue);
        }

        int count = 0;
        for(int i = list.size() - 1; i >= 0;) {
            if(list.get(i) <= k) {
                if(k-list.get(i) >= 0) {
                    k -= list.get(i);
                    count++;
                    if(k == 0) break;
                }
            } else i--;
        }

        System.out.println(count);
    }
}
