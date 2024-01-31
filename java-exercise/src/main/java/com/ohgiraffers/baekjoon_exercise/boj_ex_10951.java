package com.ohgiraffers.baekjoon_exercise;

import java.io.*;
import java.util.StringTokenizer;

public class boj_ex_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(((Integer) (a + b)).toString());
            bw.newLine();
        }
        bw.flush();
    }
}
