package sehwan._5._5_15;

public class programmers142086 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "banana";
        String s2 = "foobar";

        int result1[] = solution.solution(s1);
        int result2[] = solution.solution(s2);

        for(int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println("\n");

        for(int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }
    }
}

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] sp = s.split("");
        int count;

        //첫 글짜는 무조건 첫등장이니 -1로 초기화하고 반복문은 두번째(index 1)부터 시작합니다.
        answer[0] = -1;
        for(int i = 1; i < sp.length; i++) {
            answer[i] = -1;
            count = 0;
            //현재 글자부터 왼쪽으로 하나씩 비교하여 만약 같은 글자가 나오면 count를 저장해줍니다.
            for(int j = i; j > 0; j--) {
                count++;
                if(sp[i].equals(sp[j - 1])) {
                    answer[i] = count;
                    break;
                }
            }
        }

        return answer;
    }
}