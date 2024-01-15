package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class E_diamondStars {
    public static void main(String[] args) {
        E_diamondStars exClass = new E_diamondStars();
        exClass.printStarsDiamond();
    }

    public void printStarsDiamond() {
        String row = "";
        System.out.print("정수를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            printDiamondSpace(input, i);
            printDiamondStar(input, i);
            System.out.println();
        }
    }

    // 공백 채우는 기능
    private void printDiamondSpace(int input, int i) {
        // 여기에 작성
        for (int j = 1; j <= Math.abs(((input + 1) / 2) - i); j++) {
            System.out.print(" ");
        }
    }

    // 별 찍는 기능
    private void printDiamondStar(int input, int i) {
        // 여기에 작성
        for (int k = 1; k <= -2 * Math.abs(i - (input + 1) / 2) + input ; k++) {
            System.out.print("*");
        }
    }
}
