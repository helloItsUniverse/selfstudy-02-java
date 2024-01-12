package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

public class Application2 {

    /* 수업목표. import에 대해 이해할 수 있다. */

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int sub = cal.subTwoNumbers(80, 21);
        System.out.println("80 - 21 = " + sub);
    }
}
