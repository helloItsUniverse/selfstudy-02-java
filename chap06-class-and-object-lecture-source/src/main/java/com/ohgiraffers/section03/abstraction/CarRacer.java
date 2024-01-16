package com.ohgiraffers.section03.abstraction;

public class CarRacer {
    private Car myCar = new Car();
    public void startUp() {
        this.myCar.startUp();
    }

    public void stepAccelator() {
        myCar.go();
    }

    public void stepBreak() {
        myCar.stop();
    }

    public void turnOff() {
        myCar.turnOff();
    }
}
