package com.ohgiraffers.chap_01_to_04;

import java.util.Scanner;

public class ex_0114_yr {
    public void isYoonYear() {
        int yoonYear;
        String hehehe = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("연도를 입력하세요: ");
        int yearInput = sc.nextInt();

        if(yearInput % 4 == 0) {
            if(yearInput % 100 == 0) {
                yoonYear = 0;
                if(yearInput % 400 == 0) {
                    yoonYear = 1;
                }
            } else {
                yoonYear = 1;
            }
        } else {
            yoonYear = 0;
        }

        if(yoonYear == 1) hehehe = "윤년입니다.";
        else hehehe = "윤년이 아닙니다.";

        System.out.println("isYoonYear: " + yoonYear);
        System.out.println("입력하신 " + yearInput + "년은 " + hehehe);
    }
}
