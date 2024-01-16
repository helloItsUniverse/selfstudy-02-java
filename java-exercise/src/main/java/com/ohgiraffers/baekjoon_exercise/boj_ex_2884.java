package com.ohgiraffers.baekjoon_exercise;

import java.util.Scanner;

public class boj_ex_2884 {
    public static void main(String[] args) {
        int subMinute = 45;
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if (minute < subMinute) {
            hour--;
            if (hour < 0) {
                hour = 24 - 1;
            }
            minute = minute - subMinute + 60;
        } else {
            minute = minute - subMinute;
        }

        System.out.println(hour + " " + minute);
    }
}