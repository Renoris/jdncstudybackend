package byungjun._8._8_9.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int n, int[][] costs) {

        int answer = 0;
        Arrays.sort(costs, Comparator.comparingInt(o -> o[2]));

        int islandCount = 0;

        Node[] nodes = new Node[n];

        for (int i = 1; i < costs.length; i++) {

        }

        return answer;
    }

    class Node {

        int num;
        Node parent;

        public Node(int num, Node parent) {
            this.num = num;
            this.parent = parent;
        }

        public int getRootNum() {
            if (parent == this) {
                return num;
            }
            return parent.getRootNum();
        }

    }
}