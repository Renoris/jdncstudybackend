package Jin.p_5_15;

public class p3 {
    public static void main(String[] args) {
        ///어쩌고 저쩌고
    }
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;

        for (int i = 1; i < s.length(); i++) {
            int lastIndex = s.lastIndexOf(s.charAt(i), i - 1);
            answer[i] = (lastIndex == -1) ? -1 : (i - lastIndex);
        }

        return answer;

    }

}
