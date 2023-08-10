package sehwan._6._6_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class beakjoon1874 {

    public static Stack<Integer> stack = new Stack<>();
    public static int[] values;
    public static int count = 0;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //수열의 크기를 저장받습니다.

        values = new int[n]; //수열의 크기만큼 배열을 선언합니다.

        for(int i = 0; i < n; i++) { //만들어야 할 수열을 저장받습니다.
            values[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 1; i <= n; i++) {
            stack.push(i); //일단 값을 스택에 넣습니다.
            sb.append("+").append("\n");

            if(i == values[count]) {  //방금 스택에 넣은 값이 현재 수열의 값(처음부터 순차적으로 진행)과 같다면
                if(!checkAble()) {    //수열을 만들수 있는지 없는지 확인합니다.
                    sb = new StringBuilder(); //수열을 만들수 없다고 판단되면 "NO"를 스트링빌드하고 반복을 중단합니다.
                    sb.append("NO");
                    break;
                }
            }
        }

        System.out.println(sb); //결과를 출력합니다.
    }

    private static boolean checkAble() {
        stack.pop(); //이 메소드에 진입했다는것은 최소한 스택의 마지막 저장이 수열의 순서와 일치한것이기 때문에 일단 pop합니다.
        sb.append("-").append("\n");
        if(count == values.length - 1) return true; //수열의 마지막값을 처리한 상황이라면 바로 리턴하고 아니라면 수열의 다음 값을 보기위해 count를 +1.
        else count++;

        if(!stack.isEmpty() && stack.peek() == values[count]) { //스택에 마지막 값이 수열의 다음 값과 일치하면 메소드를 반복합니다.
            if(!checkAble()) return false;
        } else if(stack.contains(values[count])) { //스택의 마지막 값이 수열의 다음 값이 아닌데, 수열의 다음값이 스텍 어딘가에 존재하면 수열을 만들 수 없습니다.
            return false;
        }

        return true;
    }
}
