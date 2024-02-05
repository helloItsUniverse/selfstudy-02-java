package com.ohgiraffers.baekjoon_exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class boj_ex_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = 10;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int newNum = Integer.parseInt(br.readLine()) % 42;
            boolean isExist = list.contains(newNum);
            if (!isExist) {
                count++;
            }
            list.add(newNum);
        }
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }
}
