package KH._7._7_18;

import java.time.LocalTime;

public class Solution {
    public static void main(String[] args) {
        String[][] book_time = new String[2][2];
        book_time[0][0] = "09:10";
        book_time[0][1] = "10:10";
        book_time[1][0] = "10:20";
        book_time[1][1] = "23:50";
        LocalTime[][] bookTime = new LocalTime[2][2];
        for(int i = 0; i < book_time.length; i++){
            bookTime[i][0] = LocalTime.parse(book_time[i][0]);
            bookTime[i][1] = LocalTime.parse(book_time[i][1]).plusMinutes(10);
            System.out.println(bookTime[i][0]);
            System.out.println(book_time[i][0]);
        }
    }
}
