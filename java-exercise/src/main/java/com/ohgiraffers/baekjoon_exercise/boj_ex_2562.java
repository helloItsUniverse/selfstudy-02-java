package com.ohgiraffers.baekjoon_exercise;

import java.io.*;

public class boj_ex_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i + 1;
            }
        }
        bw.write(((Integer) max).toString());
        bw.newLine();
        bw.write(((Integer) maxIndex).toString());
        bw.flush();
        bw.close();
    }
}
