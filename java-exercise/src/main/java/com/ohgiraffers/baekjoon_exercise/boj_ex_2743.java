package com.ohgiraffers.baekjoon_exercise;

import java.io.*;

public class boj_ex_2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        bw.write(Integer.toString(str.length()));
        bw.flush();
        bw.close();
    }
}
