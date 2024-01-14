package com.ohgiraffers.chap_01_to_04;
import java.util.Scanner;

public class ex_0114_wj {

    public void dayday() {

        char yoil;
        Scanner sc = new Scanner(System.in);

        System.out.print("날짜를 정수로 입력하세요: ");
        int dayInput = sc.nextInt();

        if(dayInput <= 31 && dayInput >= 1) {
            if (dayInput % 7 == 0) yoil = '일';
            else if (dayInput % 7 == 1) yoil = '월';
            else if (dayInput % 7 == 2) yoil = '화';
            else if (dayInput % 7 == 3) yoil = '수';
            else if (dayInput % 7 == 4) yoil = '목';
            else if (dayInput % 7 == 5) yoil = '금';
            else yoil = '토';

            System.out.println("입력하신 날짜는 " + yoil + "요일 입니다.");
        } else {
            System.out.println("똑바로 입력하세요");
        }
    }
}