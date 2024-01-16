package com.ohgiraffers.section02.encapsulation.resolved;

public class Monster {

    // 객체와 관련된 클래스에는 모든 필드를 private로 설정해야 한다.
    // encapsulation을 위해서는 변수의 타입 앞에 접근제어자(private)를 붙인다.
    private String name;
    private int hp;

    // 일반적으로 클래스 안의 메소드에선 public을 붙임.
    public void setInfo1(String info1) {
        this.name = info1;
    }

    public void setInfo2(int info2) {
        this.hp = info2;
    }
}
