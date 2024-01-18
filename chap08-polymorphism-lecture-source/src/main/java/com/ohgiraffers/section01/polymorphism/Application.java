package com.ohgiraffers.section01.polymorphism;

public class Application {
    public static void main(String[] args) {
        /* 수업목표. 다형성과 타입 형변환에 대해 이해할 수 있다. */
        /* 설명. 여기서는 상속 관계인 자식에서 부모로 가는 형변환에 대해 다룬다 */
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();
    }
}
