package byungjun._6._6_7.programmers;

class Solution {
    private int[][] emoticonsMoney;
    private int[][] users;
    private int maxSigner;
    private int maxMoney;

    public int[] solution(int[][] users, int[] emoticons) {
        init(users, emoticons);

        //유저별로 집계
        int[] sumMoneys = new int[users.length];

        for (int i = 0; i < users.length; i++) {
            int discountStartIndex = users[i][0] / 10;
            int userMindMoney = users[i][1];

            //시작 할인 가율
            for (int j = discountStartIndex; j < 5; j++) {

            }
        }
        return new int[]{23};
    }


    private void init(int[][] users, int[] emoticons) {
        this.users = users;
        maxMoney = 0;
        maxSigner = 0;

        emoticonsMoney = new int[emoticons.length][5];

        for (int i = 0; i < emoticons.length; i++) {
            for (int j = 0; j < 5; j++) {
                emoticonsMoney[i][j] = emoticons[i] - (emoticons[i] * j / 10);
            }
        }
    }
}