package com.ohgiraffers.chap04.section01.greedy;

public class Application1 {
    public static int solution(int n) {
        int count = 0;       // 들고 갈 최소 봉지 개수

        while (true) {

            /* 설명. 5kg로 바로 나눌 수 있으면 n/5 를 반환한다. */
            if (n % 5 == 0) {                   // 이 줄이 핵심. 이 조건을 먼저 만나게 하는 것이 'greedy 하다'
                return n / 5 + count;           // (+ count)의 개념은 이전 반복에서 가져간 3kg 봉지의 수이다.
            } else if (n < 0) {
                return -1;
            }

            /* 설명. 3kg로 한 봉지 들고 간다. */
            n = n - 3;
            count++;

        }
    }
}
