package sehwan._7_24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Programmers42890 {

    public static List<List<Integer>> candidateKeys;
    public static void main(String[] args) {

        String[][] relation =
                {{"100","ryan","music","2"}
                ,{"200","apeach","math","2"}
                ,{"300","tube","computer","3"}
                ,{"400","con","computer","4"}
                ,{"500","muzi","music","3"}
                ,{"600","apeach","music","2"}};

        int answer;
        answer = Solution(relation);

        System.out.println(answer);
    }

    private static int Solution(String[][] relation) {
        int answer = 0;

        candidateKeys = new ArrayList<>();
        List<Integer> attributes = new ArrayList<>();

        for(int i = 0; i < relation[0].length; i++) {
            getAnswer(0, attributes, relation, i + 1);
        }

        answer = candidateKeys.size();

        return answer;
    }

    private static void getAnswer(int start, List<Integer> attributes, String[][] relation, int count) {
        if(count == attributes.size()) {
            //최소성 검사
            boolean check = checkA(attributes);
            if(!check) return;

            //유일성 검사
            check = checkB(attributes, relation);
            if(!check) return;

            //저장
            candidateKeys.add(new ArrayList<>(attributes));

            return;
        }

        // 조합 만들기
        for(int i = start; i < relation[0].length; i++) {
            attributes.add(i);
            getAnswer(i + 1, attributes, relation, count);
            attributes.remove(attributes.size() - 1);
        }
    }

    //최소성 검사
    private static boolean checkA(List<Integer> attributes) {
        for(List<Integer> candidate : candidateKeys) {
            if(attributes.containsAll(candidate)) {
                return false;
            }
        }
        return true;
    }

    //유효성 검사
    private static boolean checkB(List<Integer> attributes, String[][] relation) {
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < relation.length; i++) {
            for(int j : attributes) {
                sb.append(relation[i][j]);
            }
            set.add(sb.toString());
            sb.setLength(0);
        }

        if(set.size() == relation.length) return true;
        else return false;
    }
}
