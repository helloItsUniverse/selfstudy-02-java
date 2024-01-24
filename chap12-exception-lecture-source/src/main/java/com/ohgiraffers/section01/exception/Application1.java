package com.ohgiraffers.section01.exception;

public class Application1 {
    public static void main(String[] args) throws Exception {

        /* 수업목표. 예외에 대해 이해하고 이를 처리하기 위한 문법을 활용할 수 있다. */
        ExceptionTest et = new ExceptionTest();

        /* 설명. try-catch구문을 통해 프로그램이 종료되지 않게 처리할 수 있다. */
        try {

            /* 설명. catch 구문으로 처리할 예외가 발생하는 부분을 try 구문으로 묶을 수 있다. */
            /* 설명. (범위는 너무 크지 않게 적당히 지정할 것(관련있는 것만)) */

            et.checkEnoughMoney(10000, 50000);
            et.checkEnoughMoney(50000, 10000);          // 여기서 예외가 터지고 이 아래부터 try 까지의 구문은 실행되지 않음.
            System.out.println("이전에 문제 없었으면 실행 될 try의 나머지 부분");
        } catch (Exception e) {

            /* 설명.
             *  try 구문에서 발생한 예외를 처리하기 위한 구문으로 우리가 원하는 방식으로 예외 상황에 대해 처리할 수 있다.
             *  (단순 출력 또는 예외 타입에서 제공하는 메소드를 활용한 처리 모두 가능)
             *  catch 구문에 아무런 처리 구문도 작성하지 않으면 예외 발생 유무를 파악하기 힘들기 때문에 간간한 처리라도 반드시 작성해야 한다.
            * */
//            System.out.println("돈 좀 넉넉히 들고 다니지~!");
//            System.out.println(e.getClass());
            System.out.println("에러 발생 시 메시지 확인: " + e.getMessage());
            /* 설명. try 구문에서 발생한 예외 타입을 받아 JVM이 처리해주는 방식으로 처리할 수 있다. */
            e.printStackTrace();

            /* 설명. 내가 원하는 시점에 프로그램을 종료할 수도 있다. (비추천) */
//            System.exit(0);
        }
        System.out.println("프로그램이 종료됩니다.");
    }
}
