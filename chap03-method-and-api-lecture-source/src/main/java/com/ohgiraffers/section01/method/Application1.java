package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 메소드의 호출 흐름에 대해 이해할 수 있다. */

        /* 필기.
         *  메소드란?
         *  메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        * */

        System.out.println("main() 시작됨...");
        methodA();          // 메소드가 다른 메소드를 호출하는 구조
        System.out.println("main() 종료됨...");
    }

    public static void methodA() {          // 단순히 호출하는 경우엔 static 을 붙이는 게 좋음.
        System.out.println("methodA() 호출됨...");
        methodB();
        System.out.println("methodA() 종료됨...");
    }

    public static void methodB() {
        System.out.println("methodB() 호출됨...");
    }
}
