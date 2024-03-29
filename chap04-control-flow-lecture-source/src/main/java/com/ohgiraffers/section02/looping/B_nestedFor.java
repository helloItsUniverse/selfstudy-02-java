package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTwoToNine() {
        /* 수업목표. 중첩된 for문의 흐름을 이해하고 적용할 수 있다. */

        /* 설명.
         *  2단
         *   2 * 1 = 2
         *   2 * 2 = 4
         *   2 * 3 = 6
         *   ...
         *   9 * 7 = 63
         *   9 * 8 = 72
         *   9 * 9 = 81
        * */

        for(int i = 2; i < 10; i++){
            System.out.println(i + "단수의 곱");
            for (int j = 1; j < 10; j++) {
                System.out.println((i + " * " + j + " = " + (i * j)));
            }
        }

        StringBuilder row = new StringBuilder();
        for (int i = 2; i <= 9; i++) {
            System.out.print(i + "단: ");
            for (int j = 1; j <= 9; j++) {
                row.append((i * j) + " ");
            }
            System.out.println(row);
            row.setLength(0);
        }

    }

    public void printUpgradedGugudanFromTwoToNine() {

        /* 수업목표. inner for문을 메소드로 따로 모듈화 해보자.(하나의 기능 단위로 보고) */
        for(int dan = 2; dan < 10; ++dan) {
            System.out.println(dan + "수 출력");
            printGugudanOf(dan);
            System.out.println();
        }
    }

    /* 필기.
     *  좋은 코드:
     *   1. 가독성 좋음
     *   2. 유지보수 하기 좋음
    * */
    /* 설명. 단수를 넘기면 1~9 까지 곱해서 숫자를 출력해주는 기능 */
    private void printGugudanOf(int dan) {
        for (int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    /* 설명.
     *  아래와 같은 별모양이 나오도록 작성해 보자.
     *      *
     *     **
     *    ***
     *   ****
     *  *****
     *
    * */
    public void printStars() {
        String row = "";
        System.out.print("정수를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        for(int i = 1; i <= numRows; i++) {
            row = printSpaceLeft(row, numRows, i);
            row = printStar(row, i);
            System.out.println(row);
            row = "";
        }
    }

    private String printSpaceLeft(String row, int numRows, int i) {
        for (int j = 1; j <= numRows - i; j++) {
            row += " ";
        }
        return row;
    }

    private String printStar(String row, int i) {
        for (int k = 1; k <= i; k++) {
            row += "*";
        }
        return row;
    }

    public void printStarsDiamond() {
        String row = "";
        System.out.print("정수를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            // void method ver.
            printStarsDiamondSpaceVoid(input, i);
            printStarsDiamondStarVoid(input, i);
            printStarsDiamondSpaceVoid(input, i);
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= input; i++) {
            // String method ver.
            row = printStarsDiamondSpaceString(row, input, i);
            row = printStarsDiamondStarString(row, input, i);
            row = printStarsDiamondSpaceString(row, input, i);
            System.out.println(row);
            row = "";
        }
    }

    private String printStarsDiamondSpaceString(String row, int input, int i) {
        for (int j = 1; j <= Math.abs(((input + 1) / 2) - i); j++) {
            row += " ";
        }
        return row;
    }

    private String printStarsDiamondStarString(String row, int input, int i) {
        for (int k = 1; k <= -2 * Math.abs(i - (input + 1) / 2) + input ; k++) {
            row += "*";
        }
        return row;
    }

    private void printStarsDiamondSpaceVoid(int input, int i) {
        for (int j = 1; j <= Math.abs(((input + 1) / 2) - i); j++) {
            System.out.print(" ");
        }
    }

    private void printStarsDiamondStarVoid(int input, int i) {
        for (int k = 1; k <= -2 * Math.abs(i - (input + 1) / 2) + input ; k++) {
            System.out.print("*");
        }
    }
}

//                2 1 2
//                1 3 1
//                0 5 0
//                1 3 1
//                2 1 2
//
//                3 1 3
//                2 3 2
//                1 5 1
//                0 7 0
//                1 5 1
//                2 3 2
//                3 1 3

// Stars Algorithm (when 5)
// (input + 1) / 2 = 3
// input = 5

// -2 * |x - 3| + 5

// -2 * |1 - 3| + 5 = 1
// -2 * |2 - 3| + 5 = 3
// -2 * |3 - 3| + 5 = 5
// -2 * |4 - 3| + 5 = 3
// -2 * |5 - 3| + 5 = 1

//when 7

// -2 * |1 - 4| + 7 = 1

