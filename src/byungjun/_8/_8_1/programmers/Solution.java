package byungjun._8._8_1.programmers;

class Solution {

    public static void main(String[] args) {
        String s = "a";
        Solution solution = new Solution();
        solution.solution(s);
    }

    public int solution(String s) {

        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= s.length() / 2; i++) {
            min = Math.min(getZipLength(s, i), min);
        }

        return min;
    }

    private int getZipLength (String line, int length) {
        String beforeSliced = getSubString(line, 0, length);
        StringBuilder sb = new StringBuilder();
        int index = length;
        int num = 1;

        do {
            String sliced = getSubString(line, index, length);

            if (beforeSliced.equals(sliced)) {
                num++;

            } else {
                if (num != 1) sb.append(num);
                sb.append(beforeSliced);
                beforeSliced = sliced;
                num = 1;
            }

            index += length;
        } while (index < line.length());

        if (num != 1) sb.append(num);
        sb.append(beforeSliced);

        return sb.toString().length();
    }

    private String getSubString (String line, int index, int length) {
        int bound = index + length;

        int nowLength = line.length() - index;

        if (nowLength < length) {
            bound = line.length();
        }

        return line.substring(index, bound);
    }
}
