package byungjun._6._6_21._2805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static long[] trees;
    private static long num;

    public static void main(String[] args) throws IOException {
        read();
        long totalTree = 0;
        for (int i = 0; i < trees.length; i++) {
            totalTree += trees[i];
        }

        System.out.println(binarySearch(0, totalTree + 1));
    }

    private static long binarySearch(long start, long max) {
        if (start == max) {
            return start;
        }

        long middle = (start + max) / 2;

        if (cuttingTree(middle) <= num) {
            return binarySearch(start, middle);
        } else {
            return binarySearch(middle + 1, max);
        }
    }

    private static long cuttingTree(long cutterLength) {
        long count = 0;
        for (int i = 0; i < trees.length; i++) {
            long add = (trees[i] - cutterLength) < 0 ? 0 : trees[i] - cutterLength; ;
            count += add;
        }
        return count;
    }


    private static void read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLines = br.readLine().split(" ");
        int treeLength = Integer.parseInt(firstLines[0]);
        trees = new long[treeLength];
        num = Integer.parseInt(firstLines[1]);
        String[] seconds = br.readLine().split(" ");
        for (int i = 0; i < treeLength; i++) {
            trees[i] = Integer.parseInt(seconds[i]);
        }
    }
}
