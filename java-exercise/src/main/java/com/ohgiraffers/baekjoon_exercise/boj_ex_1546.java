package com.ohgiraffers.baekjoon_exercise;

import java.io.*;
import java.util.StringTokenizer;

public class boj_ex_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int max = 0;
        double sum = 0;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        double[] newArr = new double[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) max = arr[i];
        }
        for (int i = 0; i < N; i++) {
            newArr[i] = arr[i] / (double) max * 100;
            sum += newArr[i];
        }
        bw.write(Double.toString(sum / N));
        bw.flush();
        bw.close();
    }
}