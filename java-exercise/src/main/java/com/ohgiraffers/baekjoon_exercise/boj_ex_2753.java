package com.ohgiraffers.baekjoon_exercise;

import java.util.Scanner;

public class boj_ex_2753 {
    public static void main(String[] args) {
        int isYoonYear;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if((input % 4 == 0 && input % 100 != 0) || input % 400 == 0) {
            isYoonYear = 1;
        } else {
            isYoonYear = 0;
        }
        System.out.println(isYoonYear);
    }
}
