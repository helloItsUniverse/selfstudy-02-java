package com.ohgiraffers.baekjoon_exercise;

import java.io.*;
import java.util.StringTokenizer;

public class boj_ex_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int i, j;
        for (int k = 0; k < N; k++) {
            arr[k] = k + 1;
        }
        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken()) - 1;
            j = Integer.parseInt(st.nextToken()) - 1;

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        for (int l = 0; l < N; l++) {
            bw.write(arr[l] + " ");
        }
        bw.flush();
        bw.close();
    }
}
