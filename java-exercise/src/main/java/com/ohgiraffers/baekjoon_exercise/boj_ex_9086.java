package com.ohgiraffers.baekjoon_exercise;

import java.io.*;

public class boj_ex_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        String[] arr = new String[T];
        for (int i = 0; i < T; i++) {
            arr[i] = br.readLine();
            bw.write(arr[i].charAt(0));
            bw.write(arr[i].charAt(arr[i].length() - 1));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
