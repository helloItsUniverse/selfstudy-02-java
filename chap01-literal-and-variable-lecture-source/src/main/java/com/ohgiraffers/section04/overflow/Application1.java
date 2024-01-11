package com.ohgiraffers.section04.overflow;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 오버플로우에 대해 이해할 수 있다. */

        /* 필기.
         *  자료형 별 값의 최대 범위를 벗어나는 경우
         *  발생할 carry를 버림처리 하고 sign bit를 반전시켜 최소
        * */

        /* 목차. 1. 오버플로우 */
        System.out.println("========== Overflow ==========");
        byte num1 = 126;                        // byte 자료형의 양의 최대 저장 범위 값 : 127

        num1++;                                 // num1 = num1 + 1 과 의미상 같다.
        System.out.println("num1 = " + num1);   // num1 = 127

        num1++;
        System.out.println("num1 = " + num1);   // num1 = -128

        num1++;
        System.out.println("num1 = " + num1);   // num1 = -127


        /* 목차. 2. 언더플로우 */
        System.out.println("========== Underflow ==========");
        byte num2 = -127;

        num2--;                                 // num2 = num2 - 1 과 의미상 같다.
        System.out.println("num2 = " + num2);   // num2 = -128

        num2--;
        System.out.println("num2 = " + num2);   // num2 = 127

        num2--;
        System.out.println("num2 = " + num2);   // num2 = 126

        /* 설명.
         *  일반적으로 많이 사용하는 int형의 최대값은 대략 21억 정도이다.
         *  이 범위를 벗어난 계산은 오버플로우를 발생시켜 원하지 않는 결과값이 나오게 될 수 있다.
        * */
        int firstNum = 1000000;                 // 100만
        int secondNum = 700000;                 // 70만

        int multi = firstNum * secondNum;       // 7천억이 나와야 함. 변수를 사용해서 21억이 넘는걸 인지하지 못함

        System.out.println("firstNum * secondNum = " + multi);  // -79669248
    }
}
