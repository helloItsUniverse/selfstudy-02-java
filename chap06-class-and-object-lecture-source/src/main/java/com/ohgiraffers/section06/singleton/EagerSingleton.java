package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton eager = new EagerSingleton();

    // 싱글톤의 핵심
    // 생성자의 접근제어자를 private 로 하여 다른 곳에서 new 를 통해 새로운 객체 생성을 막음.
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return eager;
    }
}
