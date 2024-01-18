package com.ohgiraffers.baekjoon_exercise;

import java.util.Scanner;

public class boj_ex_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int addM = sc.nextInt();

        if(m + addM >= 60) {
            h = h + (m + addM) / 60;
            m = (m + addM) % 60;
        } else {
            m = m + addM;
        }
        if(h >= 24) {
            h = h % 24;
        }
        System.out.println(h + " " + m);
    }
}
