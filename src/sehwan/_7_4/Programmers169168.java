package sehwan._7_4;

public class Programmers169168 {
    public static void main(String[] args) {

        int m = 10;
        int n = 10;
        int startX = 3;
        int startY = 7;
        int[][] balls = {{7, 7}, {2, 7}, {7, 3}};

        int[] answer = Solution(m, n, startX, startY, balls);

        for(int i: answer) {
            System.out.println(i);
        }
    }

    private static int[] Solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];

        for(int i = 0; i < balls.length; i++) {
            int targetX = balls[i][0];
            int targetY = balls[i][1];

            // 같은 x / y 좌표가 있을경우
            if(startX == targetX) { //x좌표가 같을때
                if(startY < targetY) { // 목표가 위에 있으면
                    answer[i] = (int)Math.pow((2 * startY) + (targetY - startY), 2);
                } else { // 목표가 아래에 있으면
                    answer[i] = (int)Math.pow((2 * (10 - startY)) + (startY - targetY), 2);
                }
            } else if(startY == targetY) { //y좌표가 같을때
                if(startX < targetX) { // 목표가 오른쪽에 있으면
                    answer[i] = (int)Math.pow((2 * startX) + (targetX - startX), 2);
                } else { // 목표가 왼쪽에 있으면
                    answer[i] = (int)Math.pow((2 * (10 - startX)) + (startX - targetX), 2);
                }
            } else {
                answer[i] = Integer.MAX_VALUE;
            }


            // 가장 가까운 벽까지의 거리




//            if(answer[i] > result) answer[i] = result;
        }

        return answer;
    }
}
