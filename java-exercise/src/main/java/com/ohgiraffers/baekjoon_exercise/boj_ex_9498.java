package com.ohgiraffers.baekjoon_exercise;

import java.util.Scanner;

public class boj_ex_9498 {
    public static void main(String[] args) {
        String grade = "";
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score >= 90) grade = "A";
        else if(score >= 80 && score < 90) grade = "B";
        else if(score >= 70 && score < 80) grade = "C";
        else if(score >= 60 && score < 70) grade = "D";
        else grade = "F";

        System.out.println(grade);
    }
}
