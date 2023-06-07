package byungjun._5._5_31.secretmap;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = parseMap((long)arr1[i] | (long) arr2[i],n);
        }

        return answer;
    }

    private String parseMap(long num, int n) {
        String format = "%0"+n+"d";
        return String.format(format, Long.parseLong(Long.toBinaryString(num))).replace("0"," ").replace("1","#");
    }
}