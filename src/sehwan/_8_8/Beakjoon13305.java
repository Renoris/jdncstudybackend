package sehwan._8_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Beakjoon13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //테스트 케이스를 입력받습니다.
        int n = Integer.parseInt(br.readLine());

        BigInteger[] roads = new BigInteger[n - 1];
        BigInteger[] cities = new BigInteger[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n - 1; i++) {
            roads[i] = new BigInteger(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            cities[i] = new BigInteger(st.nextToken());
        }

        /**
         * 고려사항
         * 당연히 가격이 저렴한 주유소에서 많이 채우는게 이득.
         * 현재 주유소보다 더 저렴한 주유소가 나오기 전까지 갈 수 있는 만큼만 주유하면 됩니다.
         * 숫자 단위가 억단위이므로 큰 수를 다룰 수 있도록 고려해야 합니다.
         */
        BigInteger total = BigInteger.ZERO;
        BigInteger distance = BigInteger.ZERO;
        BigInteger nowCity = cities[0];

        for(int i = 0; i < n - 1; i++) {
            distance = distance.add(roads[i]);

            if(cities[i + 1].compareTo(nowCity) == -1 || i == n - 2) {
                total = total.add(distance.multiply(nowCity));
                nowCity = cities[i + 1];
                distance = BigInteger.ZERO;
            }
        }

        System.out.println(total);
    }
}
