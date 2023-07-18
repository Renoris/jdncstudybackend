package KH._6_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int treeNum = Integer.parseInt(input[0]);
        int needs = Integer.parseInt(input[1]);
        int[] trees = new int[treeNum];
        String[] treeString = br.readLine().split(" ");
        for(int i = 0; i < treeString.length; i++){
            trees[i] = Integer.parseInt(treeString[i]);
        }
        Arrays.sort(trees);
        int result = 0;
        int min = 1;
        int max = trees[treeNum-1];
        while(true){
            long treeLength = 0;
            result= (max+min)/2;
            if (result == min) {
                break;
            }
            for(int tree : trees){
                if(tree -result > 0){
                    treeLength += tree - result;
                }
            }
            if(treeLength == needs) break;
            else if (treeLength > needs) {
                min = result;
            }
            else {
                max = result;
            }
        }

        System.out.println(result);

    }
}
