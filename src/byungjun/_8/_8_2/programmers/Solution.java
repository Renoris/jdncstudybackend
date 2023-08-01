package byungjun._8._8_2.programmers;

import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {

        Arrays.sort(phone_book);

        boolean flag = true;
        for (int i = 0; i < phone_book.length; i++) {
            if (i < phone_book.length - 1 && phone_book[i+1].startsWith(phone_book[i])) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}