package com.ohgiraffers.baekjoon_exercise;

import java.util.Scanner;

public class boj_ex_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e, f;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a * (b % 10);
        d = a * ((b / 10) % 10);
        e = a * (b / 100);
        f = c + d * 10 + e * 100;
        System.out.println(c + "\n" + d + "\n" + e + "\n" + f);
    }
}
