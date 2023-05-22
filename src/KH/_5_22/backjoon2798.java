package KH._5_22;
import java.io.*;
import java.util.Arrays;
public class backjoon2798 {
    // 백트래킹 사용
// 사용 예시 : combination(arr, visited, 0, n, r)
    static int result = 0;
    static void combination(int[] arr, boolean[] visited, int start, int n, int r, int base) {
        int sum = 0;
        if(r == 0) {
            for(int i = 0; i < n; i++){
                if(visited[i] == true){
                    sum += arr[i];
                }
            }
            if(sum > result && sum <= base){
                result = sum;
            }
//            System.out.println(result);
//            System.out.println(Arrays.toString(visited));
            return;
        }

        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1, base);
            visited[i] = false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        String[] numArr = br.readLine().split(" ");
        boolean[] visited = new boolean[Integer.parseInt(arr[0])];
        int num = Integer.parseInt(arr[0]);
        int base = Integer.parseInt(arr[1]);
        int result = 0;
        int[] numToInt = new int[numArr.length];
        for(int i = 0; i < numArr.length; i++){
            numToInt[i] = Integer.parseInt(numArr[i]);
        }
        combination(numToInt,visited,0,num,3,base);
        System.out.println(backjoon2798.result);

    }
}
