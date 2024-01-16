package com.ohgiraffers.baekjoon_exercise;


// 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.

// 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다.
// 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다.
// 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
// 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.

// 예제 입력
// 5 3
// 5 4 3 2 1
// 1 3
// 2 4
// 5 5

// 예제 출력
// 12
// 9
// 1

import java.util.Arrays;
import java.util.Scanner;

public class boj_ex_11659 {

    public static void main(String[] args) {
        int hStart;
        int hEnd;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
//        System.out.print("N M 입력: ");
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N + 1];
        int[] arrOut = new int[M];

        for (int i = 1; i <= N; i++) {

            arr[i] = arr[i-1] + sc.nextInt();
        }
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < M; i++) {
            hStart = sc.nextInt();
            hEnd = sc.nextInt();
            arrOut[i] = arr[hEnd] - arr[hStart - 1];

        }
        for (int out : arrOut) {
            System.out.println(out);
        }
    }
}
