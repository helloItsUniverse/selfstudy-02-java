package com.ohgiraffers.baekjoon_exercise;

import java.io.*;

public class boj_ex_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char ch = br.readLine().charAt(0);
        bw.write(String.valueOf((int)ch));
        bw.flush();
        bw.close();
    }
}
