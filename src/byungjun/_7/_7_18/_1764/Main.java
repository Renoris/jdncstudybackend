package byungjun._7._7_18._1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");

        int noListening = Integer.parseInt(firstLine[0]);
        int noWatching = Integer.parseInt(firstLine[1]);

        Set<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < noListening; i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i < noWatching; i++) {
            String line = br.readLine();
            if (set.contains(line)) list.add(line);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append("\n");

        Collections.sort(list);
        for (String item : list) {
            sb.append(item).append("\n");
        }

        System.out.println(sb);
    }

}
