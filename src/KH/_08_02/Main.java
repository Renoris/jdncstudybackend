package KH._08_02;

import java.util.Scanner;

public class Main {

    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        hanoi(N, 1, 2, 3);
        System.out.println((int)Math.pow(2, N)-1);
        System.out.println(sb);
    }

    public static void hanoi(int N, int start, int mid, int end){
        if(N == 1){
            sb.append(start + " " + end + "\n");
            return;
        }
        //N-1개를 1에서 2로 이동
        hanoi(N-1, start, end, mid);
        //실제로 옮겨지는 1개의 과정
        sb.append(start + " " + end + "\n");
        //N-1개를 2에서 3으로 이동
        hanoi(N-1,mid,start,end);
    }
}
