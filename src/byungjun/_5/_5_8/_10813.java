package byungjun._5._5_8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class _10813 {
    private static HashMap<Integer, Integer> hashMap = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int count = Integer.parseInt(firstLine[0]);
        int caseNum = Integer.parseInt(firstLine[1]);

        for (int i = 0; i < caseNum; i++) {
            Integer[] line = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

            if (hashMap.containsKey(line[0]) && hashMap.containsKey(line[1])) {
                int temp = hashMap.get(line[0]);
                hashMap.put(line[0], hashMap.get(line[1]));
                hashMap.put(line[1], temp);
            } else if (hashMap.containsKey(line[0])) {
                hashMap.put(line[1], hashMap.get(line[0]));
                hashMap.put(line[0], line[1]);
            } else if (hashMap.containsKey(line[1])) {
                hashMap.put(line[0], hashMap.get(line[1]));
                hashMap.put(line[1], line[0]);
            } else {
                hashMap.put(line[1], line[0]);
                hashMap.put(line[0], line[1]);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            if (hashMap.containsKey(i)) sb.append(hashMap.get(i));
            else sb.append(i);
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
