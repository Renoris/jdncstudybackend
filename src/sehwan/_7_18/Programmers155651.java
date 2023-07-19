package sehwan._7_18;

import java.time.LocalTime;
import java.util.*;

public class Programmers155651 {
    public static void main(String[] args) {
        String[][] book_time = {{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};
//        String[][] book_time = {{"09:10", "10:10"}, {"10:20", "12:20"}};
//        String[][] book_time = {{"10:20", "12:30"}, {"10:20", "12:30"}, {"10:20", "12:30"}};

        int answer = Solution(book_time);
        System.out.println(answer);
        }

    private static int Solution(String[][] book_time) {
        int answer = 0;
        int[][] times = new int[book_time.length][2];

        //String 형태를 int형태로 변환하고 정렬합니다.
        for(int i = 0; i < book_time.length; i++) {
            for(int j = 0; j < 2; j++) {
                LocalTime time = LocalTime.parse(book_time[i][j]);
                times[i][j] = time.getHour() * 60 + time.getMinute();
            }
        }
        Arrays.sort(times, Comparator.comparing(a -> a[0]));

        //프로세스를 진행합니다
        List<Integer> list = new ArrayList<>();
        list.add(times[0][1]);

        for(int i = 1; i < times.length; i++) {
            for(int j = 0; j < list.size(); j++) {
                if(times[i][0] < list.get(j) + 10) { //현재 예약의 입실시간이 이전 방문객의 퇴실시간+10분보다 빠르면(즉, 새 방이 필요하면)
                    if(j == list.size() - 1) { //현재 내어준 방들 중에 빌려줄 수 있는 방이 없다면
                        list.add(times[i][1]); //새 방을 내어줍니다.
                        break;
                    }
                } else {
                    list.set(j, times[i][1]); //해당 방을 내어줍니다.
                    break;
                }
            }
        }

        answer = list.size();

        return answer;
    }

}
