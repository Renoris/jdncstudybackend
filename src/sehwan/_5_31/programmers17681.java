package sehwan._5_31;

public class programmers17681 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};

        String[] result;
        result = solution.solution(n, arr1, arr2);

        for(String s : result) {
            System.out.println(s + " ");
        }
    }
}
