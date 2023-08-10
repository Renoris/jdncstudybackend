package KH._5._5_22;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class backjoon2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int num = Integer.parseInt(input);
        for(int i = 1; i <= num; i++){
            int result = i;
            for(int j = i; j != 0; j /= 10){
                result += j%10;

            }
            if(result == num){
                System.out.println(i);
                break;
            }
            if(i == num){
                System.out.println(0);
            }
        }
    }
}
