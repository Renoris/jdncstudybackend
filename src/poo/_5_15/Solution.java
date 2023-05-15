package poo._5_15;

class Solution {
    public static void main(String[] args) {
    }
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        s = "banana";
        System.out.println(s.indexOf("a"));

        for(int i = 0; i < s.length(); i++ ) {
            if(i != 0){
                int x = s.lastIndexOf(s.substring(i, i+1), i-1);
            }
        }

        return answer;

    }

}
