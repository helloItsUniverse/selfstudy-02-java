package com.ohgiraffers.baekjoon_exercise;

import java.io.*;
import java.util.StringTokenizer;

public class boj_ex_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String lines = br.readLine();
            StringTokenizer line = new StringTokenizer(lines.toString(), " ");
            int a = Integer.parseInt(line.nextToken());
            int b = Integer.parseInt(line.nextToken());
            if (a == 0 && b == 0) break;
            String str = ((Integer) (a + b)).toString();
            bw.write(str);
            bw.newLine();
        }
        bw.flush();
    }
}
