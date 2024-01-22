package com.ohgiraffers.section02.extend.vo;


public class RabbitFarm<T extends Rabbit> {     // Rabbit부터 그 자식 클래스까지는 T로 지정할 수 있다
    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
