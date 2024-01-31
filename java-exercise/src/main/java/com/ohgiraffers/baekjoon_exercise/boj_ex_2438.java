package com.ohgiraffers.baekjoon_exercise;

import java.io.*;

public class boj_ex_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringBuilder str1 = new StringBuilder();
        String str2 = "*";
        for (int i = 0; i < N; i++) {
            str1.delete(0, str1.length());
            for (int j = 0; j < i + 1; j++) {
                str1.append(str2);
            }
            bw.write(str1.toString());
            bw.newLine();
        }
        bw.flush();
    }
}
