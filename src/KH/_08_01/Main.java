package KH._08_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> words = new HashMap<>();
        //단어 입력을 key값으로, 횟수를 value값 10의자리, 길이를 1의자리로
        for(int i = 0; i < n; i++){
            String word = br.readLine();
            if(word.length() >= m){
                if(!words.containsKey(word)){
                    words.put(word, 10 + word.length());
                }
                else {
                    words.compute(word, (String key, Integer value) -> value + 10);
                }
            }
        }
        List<String> wordList = new ArrayList<>(words.keySet());
        //알파벳 순으로 정렬
        Collections.sort(wordList);
        //value값으로 정렬
        Collections.sort(wordList, (v1, v2) -> (words.get(v2).compareTo(words.get(v1))));
        for(String keys : wordList){
            sb.append(keys).append("\n");
        }
        System.out.println(sb);
    }
}
