package com.ohgiraffers.baekjoon_exercise;

import java.util.Scanner;

public class boj_ex_18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buddhaYear = sc.nextInt();
        int sub = 2541 - 1998;

        System.out.println(buddhaYear - sub);
    }
}
