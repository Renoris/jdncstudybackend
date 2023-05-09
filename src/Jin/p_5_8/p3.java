package Jin.p_5_8;

public class p3 {
    public static void main(String[] args) {
////어쩌고저쩌고
    }

    static int solution(int numbers[], int n) {
        int sum = 0;
        for (int num : numbers) if ((sum += num) > n) break;
        return sum;
    }


}
