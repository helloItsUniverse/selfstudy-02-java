package com.ohgiraffers.baekjoon_exercise;

import java.io.*;
import java.util.StringTokenizer;

public class boj_ex_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        int startIndex, endIndex;
        for (int i = 0; i < M; i++) {
            int tmp;
            st = new StringTokenizer(br.readLine());
            startIndex = Integer.parseInt(st.nextToken()) - 1;
            endIndex = Integer.parseInt(st.nextToken()) - 1;
            for (int j = startIndex; j <= startIndex + (endIndex - startIndex) / 2; j++) {
                tmp = arr[j];
                arr[j] = arr[startIndex + endIndex - j];
                arr[startIndex + endIndex - j] = tmp;
            }

            // 0, 7 -> 0~3
            // 0 7
            // 1 6
            // 2 5
            // 3 4

            // 2, 8 -> 2~5
            // 2 8
            // 3 7
            // 4 6
            // 5 5
        }
        for (int i = 0; i < N; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}