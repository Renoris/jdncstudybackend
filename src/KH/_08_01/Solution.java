package KH._08_01;

public class Solution {
    public int solution(String s) {
        int answer = s.length();
        String base1 = "";
        String base2 = "";
        for(int i = 1; i <= s.length()/2; i++){
            int len = 0;
            int count = 0;
            for(int j = 0; j < s.length(); j += i){
                int endIndex = Math.min(j + i, s.length());
                String st = s.substring(j, endIndex);
                if(!base2.equals(st)){
                    if(count >= 998){
                        len += 3;
                    }
                    else if(count >= 98){
                        len += 2;
                    }
                    else if(count >= 8){
                        len++;
                    }
                    count = 0;
                    base1 = base2;
                    base2 = st;
                    len += (i < st.length()) ? i : st.length();
                }
                else if(base2.equals(st) && !base1.equals(st)){
                    count = 0;
                    base1 = base2;
                    base2 = st;
                    len++;
                }
                else count++;
            }
            if(count >= 98){
                len += 2;
            }
            else if(count >= 8){
                len++;
            }
            if(answer > len) answer = len;
        }
        return answer;
    }
}
