package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다.(feat. 자료형(type)) */
        /* 필기.
        *   변수를 사용하는 방법
        *   1. 변수를 준비한다.(선언)
        *   2. 변수에 값을 대입한다.(값 대입 및 초기화)
        *   3. 변수를 사용한다.
        * */

        /* 목차. 1. 변수 선언 */
        /* 설명. 자료형이란?
         *  다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 compiler와 약속한 키워드이다.
         *  이러한 자료형은 기본자료형(Primitive Type)과 참조자료형(Reference Type)으로 나누어진다.
         *  먼저, 기본자료형 8가지부터 살펴보자.
        * */

        /* 설명. 정수를 취급하는 자료형 (부호 있음) */
        byte bnum;          // 1 byte
        short snum;         // 2 byte
        int inum;           // 4 byte (약 21억)
        long lnum;          // 8 byte

        /* 설명. 실수를 취급하는 자료형 (부호 있음) */
        float fnum;         // 4 byte
        double dnum;        // 8 byte

        /* 설명. 문자를 취급하는 자료형 (부호 없음) */
        char ch;            // 2 byte

        /* 설명. 논리값을 취급하는 자료형 (부호 없음) */
        boolean isTrue;     // 1 byte

        /* 설명. 문자열은 참조 자료형이다.(feat. 대문자로 시작) */
        String str;


        /* 목차. 2. 변수에 값 대입(초기화) */

        /* 필기. 자바는 정수 리터럴을 마주했을 때 기본적으로 int 로 생각한다. */
        bnum = 1;               // 그러나 위에서 byte 로 선언한 경우 내부적으로 (byte)1 이 된다.
        snum = 2;               // 그러나 위에서 short 로 선언한 경우 내부적으로 (short)1 이 된다.
        inum = 4;
        lnum = 2200000000L;     // 정수는 22억을 넘어가면 무조건 L을 붙여야 한다.
        lnum = (long)8;         // 작은 정수를 long 형으로 하려면 L 또는 (long) 을 붙여야 한다.
        lnum = 8L;              // 작은 정수를 long 형으로 하려면 L 또는 (long) 을 붙여야 한다.

        fnum = 4.0f;            // 위에서 float 로 선언했어도 내부적으로 (float)를 붙이지 않는다.
        dnum = 8.0;

        ch = 'a';
        ch = 97;                // char 자료형은 문자를 숫자로 취급
//        ch = -97;             // char 자료형은 0과 양수만 취급

        isTrue = true;



        /* 목차. 3. 변수 활용 */
        System.out.println("isTrue = " + isTrue);
        System.out.println("long과 int의 합: " + (lnum + inum));       // long 형으로 자동 형변환

        /* 설명. 변수의 선언 및 초기화는 한번에 가능하다. */
        int kor = 90;
        int math = 80;
        int eng = 75;

        int sum = kor + math + eng;
        double avg = sum / 3;       // sum 과 3은 int 이므로 나눗셈 연산 시 소수점이 날아가서 81. double avg 이므로 81.0 이 됨.
        double avg2 = sum / 3.0;    // 분모의 3.0 이 이미 double 이므로 나눗셈 연산 전에 sum 도 double 인 245.0 으로 바뀜.
        /* 필기. 나눗셈을 할 때는 소수점을 고려해야 한다. */


        System.out.println("총합: " + sum);
        System.out.println("평균: " + avg);
        System.out.println("평균: " + avg2);
    }
}
