package KH._5_31;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class backjoon_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        String input = "";
        int last = 0;
        for(int i = 0; i < num; i++){
            input = br.readLine();
            if(input.contains("push")){
                String[] push = input.split(" ");
                queue.add(Integer.parseInt(push[1]));
                last = Integer.parseInt(push[1]);
            } else if (input.contains("pop")) {
                if(queue.size() == 0){
                    bw.write(String.valueOf(-1));
                    bw.write("\n");
                }else {
                    bw.write(String.valueOf(queue.poll()));
                    bw.write("\n");
                }
            } else if (input.contains("size")) {
                bw.write(String.valueOf(queue.size()));
                bw.write("\n");
            } else if (input.contains("empty")) {
                bw.write(String.valueOf(queue.size() == 0 ? 1 : 0));
                bw.write("\n");
            } else if (input.contains("front")) {
                if(queue.size() == 0){
                    bw.write(String.valueOf(-1));
                    bw.write("\n");
                }else {
                    bw.write(String.valueOf(queue.peek()));
                    bw.write("\n");
                }
            } else if (input.contains("back")) {
                if(queue.size() == 0){
                    bw.write(String.valueOf(-1));
                    bw.write("\n");
                }else {
                    bw.write(String.valueOf(last));
                    bw.write("\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
