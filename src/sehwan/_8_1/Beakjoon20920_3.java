package sehwan._8_1;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Beakjoon20920_3 {
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
        wordList.put("temp", -1);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordList.entrySet());
        list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        Map<Integer, Set<String>> sameLength = new TreeMap<>();
        for(int i = 0; i < list.size() - 1; i++) {
            String currentWord = list.get(i).getKey();
            if(sameLength.containsKey(currentWord.length())) { //같은 길이의 단어가 있으면
                Set<String> set;
                set = new TreeSet<>(sameLength.get(currentWord.length()));
                set.add(currentWord);
                sameLength.put(currentWord.length(), new TreeSet<>(set));
            } else { //같은 길이의 단어가 없으면
                Set<String> set = new TreeSet<>();
                set.add(currentWord);
                sameLength.put(currentWord.length(), new TreeSet<>(set));
            }

            if(list.get(i).getValue() != list.get(i + 1).getValue()) {// 다음 단어가 중복갯수가 다르면
                //출력을 위해 저장
                List<Map.Entry<Integer, Set<String>>> convert = new ArrayList(sameLength.entrySet());
                for(int j = convert.size() - 1; j >= 0; j--) {
                    for(String value : convert.get(j).getValue()) {
                        sb.append(value).append("\n");
                    }
                }
                //초기화
                sameLength.clear();
            }
        }

        System.out.println(sb);
    }
}
