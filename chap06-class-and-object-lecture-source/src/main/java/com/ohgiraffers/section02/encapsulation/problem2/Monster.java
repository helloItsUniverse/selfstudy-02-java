package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {
//    String name;
//    int hp;

    /* 설명. 필드의 변수명이 바뀌었다면 */
    String kinds;
    int mp;

    void setInfo1(String info1) {
        this.kinds = info1;
    }

    void setInfo2(int info2) {
        this.mp = info2;
    }
}


//  단일책임의 원칙: 어떤 객체에서 에러가 났다면 그 에러가 다른 객체로 퍼지지 않아야 한다.
//  메소드 내의 변수명을 맞게 바꿔줌으로써 에러를 잡았지만 아직도 변수에 직접 접근이 가능한 상태이다. (아직 문제가 잔류)
