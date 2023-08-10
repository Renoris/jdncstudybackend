package sehwan._6._6_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class beakjoon1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int printNum;
        int target;
        int count = 0;
        Queue<Integer> importance = new LinkedList<>();

        int tc = Integer.parseInt(br.readLine());

        for(int i = 0; i < tc; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            printNum = Integer.parseInt(st.nextToken());
            target = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < printNum; j++) {
                importance.add(Integer.parseInt(st.nextToken()));
            }

            while(true) {
                int now = importance.poll(); //현재 프린트물을 가져옵니다.
                boolean check = true;
                for(int value : importance) { // 현재 프린트물보다 우선순위가 높은 프린트가 있으면 false, 없으면 True
                    if(value > now) {
                        check = false;
                        break;
                    }
                }

                if(check) { // 현재 프린트물이 가장 높은 우선순위일때
                    if(target == 0) { //타겟 프린트물이면 중지
                        count++;
                        break;
                    } else { //타겟 프린트물이 아니면 타겟의 위치를-1, 프린트순번을+1
                        target--;
                        count++;
                    }
                } else { // 현재 프린트물이 가장 높은 우선순위가 아닐때
                    importance.add(now); // 일단 맨 뒤로 보냄
                    if(target == 0) { //만약 타겟 프린트물이 맨 뒤로 간거라면 사이즈-1만큼 위치변경
                        target += importance.size() - 1;
                    } else { //만약 타겟 프린트물이 아니었다면 타겟 위치 - 1;
                        target--;
                    }
                }
            }

            sb.append(count).append("\n");
            importance.clear(); //다음 루프를 위해 초기화
            count = 0;
        }

        System.out.println(sb);
    }
}
