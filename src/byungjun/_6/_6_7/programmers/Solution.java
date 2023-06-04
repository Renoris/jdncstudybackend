package byungjun._6._6_7.programmers;

class Solution {
    private int[][] emoticonsMoney;
    private int[][] users;
    private int maxSigner;
    private int maxMoney;

    public int[] solution(int[][] users, int[] emoticons) {
        init(users, emoticons);


        int[] sumMoneys = new int[users.length];
        for (int i = 0; i < 5; i++) {
            tracking(sumMoneys, 0, i);
        }
        return new int[]{maxSigner, maxMoney};
    }

    private void tracking(int[] sumMoneys, int emotionIndex, int discountIndex) {
        if (emotionIndex >= emoticonsMoney.length) {
            int signer = 0;
            int money = 0;

            for (int i = 0; i < sumMoneys.length; i++) {
                if (sumMoneys[i] >= users[i][1]) {
                    signer++;
                } else {
                    money += sumMoneys[i];
                }
            }

            if (maxSigner < signer) {
                maxSigner = signer;
                maxMoney = money;
            } else if (maxSigner == signer) {
                maxMoney = Math.max(maxMoney, money);
            }

            return;
        }

        for (int i = 0; i < users.length; i++) {
            if (users[i][0] <= discountIndex * 10) {
                sumMoneys[i] += emoticonsMoney[emotionIndex][discountIndex];
            }
        }

        for (int i = 0; i < 5; i++) {
            tracking(sumMoneys, emotionIndex+1, i);
        }

        for (int i = 0; i < users.length; i++) {
            if (users[i][0] <= discountIndex * 10) {
                sumMoneys[i] -= emoticonsMoney[emotionIndex][discountIndex];
            }
        }
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