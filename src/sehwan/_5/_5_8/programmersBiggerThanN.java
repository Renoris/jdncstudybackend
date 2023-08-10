package sehwan._5._5_8;

public class programmersBiggerThanN {
    //테스트케이스 만들어주었습니다.
    public static void main(String[] args) {
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int[] numbers2 = {58, 44, 27, 10, 100};

        int result = solution(numbers, 123);
        System.out.println("result = " + result);

        result = solution(numbers2, 139);
        System.out.println("result = " + result);
    }



    // for-each를 사용해 작성하였습니다.
    static int solution(int numbers[], int n) {
        int answer = 0;

         for(int i : numbers){
             answer += i;
             if(answer > n) break;
         }

        return answer;
    }

}
