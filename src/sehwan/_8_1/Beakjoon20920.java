package sehwan._8_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Beakjoon20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String word;
        Map<String, Integer> wordList = new HashMap<>();

        //단어들을 입력받습니다.
        for(int i = 0 ; i < n; i++) {
            word = br.readLine();
            if(word.length() < m) continue;

            //단어목록에 이미 있는 단어면 +1해주고 아니면 새로 등록합니다.
            if(wordList.containsKey(word)) {
                wordList.replace(word, wordList.get(word) + 1);
            } else {
                wordList.put(word, 1);
            }
        }

        //중복 횟수가 많은 순서대로 정렬합니다.
        //value를 기준으로 내림차순 정렬합니다. 이를 위해 list로 변환합니다.
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordList.entrySet());
        list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        //해당 단어의 길이가 실수록 앞에 배치한다.
        int startIndex = 0;
        int lastIndex = 0;
        List<Map.Entry<String, Integer>> sublist;
        int count = 1; //후에 같은 길이의 단어를 골라내기 위함
        for(int i = 0; i < list.size() - 1; i++) {
            if(list.get(i).getValue() != list.get(i + 1).getValue()) {
                //같은 중복수를 가지는 단어들 내에서, 문자 길이순으로 내림차순 정렬
                sublist = list.subList(startIndex, lastIndex + 1);
                sublist.sort(Map.Entry.comparingByKey());
                sublist.sort(Comparator.comparingInt((Map.Entry<String, Integer> entry) -> entry.getKey().length()).reversed());
                //index세팅
                startIndex = lastIndex + 1;
                lastIndex++;
                count = 1;
            } else {
                lastIndex++;
                count++;
            }
        }
        //문자 길이순으로 내림차순 정렬
        sublist = list.subList(startIndex, lastIndex + 1);
        sublist.sort(Map.Entry.comparingByKey());
        sublist.sort(Comparator.comparingInt((Map.Entry<String, Integer> entry) -> entry.getKey().length()).reversed());

        for(Map.Entry<String, Integer> value : list) {
            sb.append(value.getKey()).append("\n");
        }

        System.out.println(sb);
    }
}
