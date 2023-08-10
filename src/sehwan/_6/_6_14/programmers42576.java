package sehwan._6._6_14;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class programmers42576 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};
        String answer = solution(participant, completion);
        System.out.println(answer);
    }

    private static String solution(String[] participant, String[] completion) {
        String answer = "";

        List<String> participantList = new ArrayList<>(Arrays.asList(participant));
        List<String> completionList = new ArrayList<>(Arrays.asList(completion));
        Collections.sort(participantList);
        Collections.sort(completionList);

        for(int i = 0; i < completionList.size(); i++) {
            String p = participantList.get(i);
            String c = completionList.get(i);

            if(!p.equals(c)) {
                answer = p;
                break;
            }
        }
        if(answer.equals("")) {
            answer = participantList.get(participantList.size()-1);
        }

        return answer;
    }
}
