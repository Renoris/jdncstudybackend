package sehwan._8_8;

public class Programmers42862 {
    public static void main(String[] args) {
        int n = 3;
//        int[] lost = {2, 4};
        int[] lost = {3};
        int[] reserve = {1};

        int answer = Solution(n, lost, reserve);

        System.out.println(answer);
    }

    private static int Solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] students = new int[n];

        for(int i = 0; i < n; i++) {
            students[i] = 1;
        }
        for(int i = 0; i < lost.length; i++) {
            students[lost[i] - 1]--;
        }
        for(int i = 0; i < reserve.length; i++) {
            students[reserve[i] - 1]++;
        }

        for(int i = 0; i < n; i++) {
            if(students[i] == 0) {
                if (i - 1 == -1) { //0번 학생이 도난당한 경우
                    if (students[i + 1] == 2) {
                        students[i + 1]--;
                        students[i]++;
                    }
                    continue;
                } else if (i + 1 == n) { //n번 학생이 도난당한 경우
                    if (students[i - 1] == 2) {
                        students[i - 1]--;
                        students[i]++;
                    }
                    continue;
                }

                if(students[i - 1] == 2) { //앞 번호에게 여분이 있으면
                    students[i - 1]--;
                    students[i]++;
                } else if(students[i + 1] == 2) { //뒷 번호에게 여분이 있으면
                    students[i + 1]--;
                    students[i]++;
                }
            }
        }

        for(int i : students) {
            if(i > 0) answer++;
        }

        return answer;
    }
}
