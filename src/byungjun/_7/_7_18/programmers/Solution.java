package byungjun._7._7_18.programmers;


class Solution {

    private int[] schedule; //3600분 / 10

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] array = {{"09:10", "10:10"}, {"10:20", "12:20"}};
        System.out.println(solution.solution(array));
    }

    public int solution(String[][] book_time) {
        int max = 0;
        schedule = new int[24 * 60 + 10];
        for (int i = 0; i < book_time.length; i++) {
            String[] times = book_time[i];

            int startTime = convertTime(times[0]);
            int endTime = convertTime(times[1]) + 10;
            for (int j = startTime; j < endTime; j++) {
                schedule[j]++;
                max = Math.max(max, schedule[j]);
            }
        }

        return max;
    }

    private int convertTime (String time) {
        String[] times = time.split(":");
        int hour = Integer.parseInt(times[0]) * 60;
        int minute = Integer.parseInt(times[1]);
        return hour + minute;
    }
}