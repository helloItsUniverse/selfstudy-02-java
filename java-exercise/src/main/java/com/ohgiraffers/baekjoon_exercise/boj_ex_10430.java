package com.ohgiraffers.baekjoon_exercise;

import java.util.Scanner;

public class boj_ex_10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.print(((a + b) % c) + "\n" +
                         (((a % c) + (b % c)) % c) + "\n" +
                         ((a * b) % c) + "\n" +
                         (((a % c) * (b % c)) % c));
    }
}
