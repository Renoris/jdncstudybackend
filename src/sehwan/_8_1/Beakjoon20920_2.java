package sehwan._8_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Beakjoon20920_2 {
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

        //나머지 조건에 맞게 정렬하는 프로세스
        Map<Integer, Map<Integer, Set<String>>> sameNum = new LinkedHashMap<>();
        Map<Integer, Set<String>> sameLength = new LinkedHashMap<>();
        Set<String> set = new TreeSet<>();
        for(Map.Entry<String, Integer> i : list) {
            sameLength.clear();
            set.clear();
            if(sameNum.containsKey(i.getValue())) { //같은 중복 갯수의 단어가 있다면
                sameLength = sameNum.get(i.getValue());
                if(sameLength.containsKey(i.getKey().length())) { //같은 길이의 단어가 있으면
                    // 같은 길이의 단어셋에 현재 단어를 추가하고 다시 매핑
                    set = sameLength.get(i.getKey().length());
                    set.add(i.getKey());
                    sameLength.replace(i.getKey().length(), new TreeSet<>(set));

                } else { // 같은 길이의 단어가 없으면
                    // set에 단어를 넣고 단어의 길이를 key값으로 set을 매핑
                    set.add(i.getKey());
                    sameLength.put(i.getKey().length(), new TreeSet<>(set));
                }

                sameNum.replace(i.getValue(), new LinkedHashMap<>(sameLength));
            }
            else { //같은 중복 갯수의 단어가 없다면
                // set에 단어를 넣고 단어의 길이를 key값으로 set을 매핑
                set.add(i.getKey());
                sameLength.put(i.getKey().length(), new TreeSet<>(set));

                sameNum.put(i.getValue(), new LinkedHashMap<>(sameLength));
            }
        }

        //출력
        List<Map.Entry<Integer, Map<Integer, Set<String>>>> sameNumList = new ArrayList<>(sameNum.entrySet());
        for(Map.Entry<Integer, Map<Integer, Set<String>>> i : sameNumList) {
            List<Map.Entry<Integer, Set<String>>> sameLengthList = new ArrayList<>(i.getValue().entrySet());
            for(Map.Entry<Integer, Set<String>> j : sameLengthList) {
                Set<String> sorted = j.getValue();
                for(String k : sorted) {
                    sb.append(k).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
