package com.ohgiraffers.section03.increment;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 단항 연산자이자 증감 연산자인 연산자에 대해 이해하고 활용할 수 있다. */
        /* 필기.
         *  증감연산자
         *  피연산자의 앞 or 뒤에 사용이 가능하다.
         *   '++': 1 증가의 의미
         *   '--': 1 감소의 의미
        * */


        /* 목차. 1. 증감연산자를 단독으로 사용 */
        /* 설명. 단항의 왼쪽에 붙으면 전위연산자, 오른쪽에 붙으면 후위연산자 */

        int num = 20;
        System.out.println("num = " + num);

        num++;
        System.out.println("num = " + num);

        ++num;
        System.out.println("num = " + num);

        num--;
        System.out.println("num = " + num);

        --num;
        System.out.println("num = " + num);


        /* 목차. 2. 증감연산자를 다른 연산자(대입, 출력)와 함께 사용 */
        int firstNum = 20;
        int result1 = firstNum++ * 3;       // 대입되고 나서 1을 더함.
        System.out.println("result1 = " + result1);
        System.out.println("firstNum = " + firstNum);
        System.out.println("firstNum = " + firstNum++);     // 출력되고 나서 1을 더함. 출력: 21, 현재 firstNum = 22
        System.out.println("firstNum = " + ++firstNum);     // 출력되기 전에 1을 더함. 출력: 23(= 22 + 1), 현재 firstNum = 23

    }
}
