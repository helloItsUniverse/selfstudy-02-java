package com.ohgiraffers.baekjoon_exercise;

import java.io.*;

public class boj_ex_27866 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        sb.append(br.readLine());
        int idx = Integer.parseInt(br.readLine());
        bw.write(sb.charAt(idx - 1));
        bw.flush();
        bw.close();
    }
}
