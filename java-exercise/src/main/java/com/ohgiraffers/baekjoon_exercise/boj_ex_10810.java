package com.ohgiraffers.baekjoon_exercise;

import java.io.*;
import java.util.StringTokenizer;

public class boj_ex_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int startIndex, endIndex, ballNum;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            startIndex = Integer.parseInt(st.nextToken()) - 1;
            endIndex = Integer.parseInt(st.nextToken()) - 1;
            ballNum = Integer.parseInt(st.nextToken());

            for (int j = startIndex; j <= endIndex; j++) {
                arr[j] = ballNum;
            }
        }

        for (int i = 0; i < N; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
