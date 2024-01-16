package com.ohgiraffers.baekjoon_exercise;

import java.util.Scanner;

public class boj_ex_14681 {
    public static void main(String[] args) {
        int quadrant;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) quadrant = 1;
        else if (x < 0 && y > 0) quadrant = 2;
        else if (x < 0 && y < 0) quadrant = 3;
        else quadrant = 4;

        System.out.println(quadrant);
    }
}
