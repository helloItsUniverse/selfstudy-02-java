package com.ohgiraffers.baekjoon_exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class boj_ex_2480 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a != b && b != c && c != a) {
            int max = getMaxWhenNothingDuplicates(a, b, c);
        } else {
            int dup = getMaxWhenDuplicates(a, b, c);
        }
    }

    static int getMaxWhenNothingDuplicates(int a, int b, int c) {
        int max;
        if (a > b) {
            if (c > a) {
                max = c;
            } else {
                max = a;
            }
        } else {    // b > a
            if (c > b) {
                max = c;
            } else {
                max = b;
            }
        }
        return max;
    }

    static int getMaxWhenDuplicates(int a, int b, int c) {
        int dup;
        if (a == b && a == c) {
            dup = a;
        } else if (a == b || a == c) {
            dup = a;
        } else {
            dup = b;
        }
        return dup;
    }
}
