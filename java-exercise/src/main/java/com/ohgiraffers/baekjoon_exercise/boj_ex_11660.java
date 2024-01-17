package com.ohgiraffers.baekjoon_exercise;

// 첫째 줄에 표의 크기 N과 합을 구해야 하는 횟수 M이 주어진다. (1 ≤ N ≤ 1024, 1 ≤ M ≤ 100,000)
// 둘째 줄부터 N개의 줄에는 표에 채워져 있는 수가 1행부터 차례대로 주어진다.
// 다음 M개의 줄에는 네 개의 정수 x1, y1, x2, y2 가 주어지며, (x1, y1)부터 (x2, y2)의 합을 구해 출력해야 한다.
// 표에 채워져 있는 수는 1,000보다 작거나 같은 자연수이다. (x1 ≤ x2, y1 ≤ y2)

import java.util.Arrays;
import java.util.Scanner;

public class boj_ex_11660 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int x1, y1, x2, y2, ans;
        int[][] arr = new int[N + 1][N + 1];
        int[][] arrSum = new int[N + 1][N + 1];
        int[] arrOut = new int[M];

//        // 0으로 채워진 arrSum 이 (N + 1)*(N + 1) 행렬로 잘 생성되었는지 확인
//        for (int i = 0; i < arrSum.length; i++) {
//            System.out.println(Arrays.toString(arrSum[i]));
//        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i < arrSum.length; i++) {
            for (int j = 1; j < arrSum[i].length; j++) {
                arrSum[i][j] = arr[i][j] + arrSum[i - 1][j] + arrSum[i][j - 1] - arrSum[i - 1][j - 1];
            }
        }

//        // arr 잘 들어갔나 확인용
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < arrSum.length; i++) {
//            System.out.println(Arrays.toString(arrSum[i]));
//        }

        for (int i = 0; i < M; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            ans = arrSum[x2][y2] - arrSum[x1 - 1][y2] - arrSum[x2][y1 - 1] + arrSum[x1 - 1][y1 - 1];
            arrOut[i] = ans;
        }

        for (int out : arrOut) {
            System.out.println(out);
        }
    }
}