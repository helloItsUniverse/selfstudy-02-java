package com.ohgiraffers.baekjoon_exercise;

import java.io.*;
import java.util.StringTokenizer;

public class boj_ex_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String str = "Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b);
            bw.write(str);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
