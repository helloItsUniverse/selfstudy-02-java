package com.ohgiraffers.baekjoon_exercise;

import java.io.*;
import java.util.StringTokenizer;

public class boj_ex_10807 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine());
        for (int elem : arr) {
            if (elem == v) {
                count++;
            }
        }
        bw.write(((Integer) count).toString());
        bw.flush();
        bw.close();
    }
}
