package com.ohgiraffers.baekjoon_exercise;

import java.io.*;

public class boj_ex_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        int students = 30, num;
        int[] arr = new int[students];

        while ((str = br.readLine()) != null && !str.isEmpty()) {
            num = Integer.parseInt(str);
            arr[num - 1] = num;
        }

        for (int i = 0; i < students; i++) {
            if (arr[i] == 0) {
                bw.write(Integer.toString(i + 1));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
