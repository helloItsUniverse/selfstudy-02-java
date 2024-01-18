package com.ohgiraffers.baekjoon_exercise;

import java.util.Scanner;

public class boj_ex_2480 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a != b && b != c && c != a) {
            int price = getMaxWhenNothingDuplicates(a, b, c);
            System.out.println(price);
        } else {
            int price = getMaxWhenDuplicates(a, b, c);
            System.out.println(price);
        }
    }

    static int getMaxWhenNothingDuplicates(int a, int b, int c) {
        int max;
        if (a > b) {
            if (c > a) max = c;
            else       max = a;
        } else {    // b > a
            if (c > b) max = c;
            else       max = b;
        }
        return 100 * max;
    }

    static int getMaxWhenDuplicates(int a, int b, int c) {
        int price;
        if (a == b && a == c)      price = 10000 + a * 1000;
        else if (a == b || a == c) price = 1000 + a * 100;
        else                       price = 1000 + b * 100;

        return price;
    }
}
