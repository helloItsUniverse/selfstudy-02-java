package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    private String cpu;                 // 연산 장치
    private int hdd;                    // 하드
    private int ram;                    // 램
    private String operationSystem;     // 운영체제

    public Computer() {
        super();
        System.out.println("Computer 클래스의 기본 생성자 호출함...");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 모든 필드를 초기화하는 생성자 호출함...");
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 부모 필드까지 모두 초기화하는 생성자 호출함...");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operationSystem='" + operationSystem + '\'' +
                "} " + super.toString();
//                "} " +
//                "Product{" +
//                "code='" + super.getCode() + '\'' +
//                ", brand='" + super.getBrand() + '\'' +
//                ", name='" + super.getName() + '\'' +
//                ", price=" + super.getPrice() +
//                ", manufacturingDate=" + super.getManufacturingDate() +
//                '}';
    }           // 자식의 toString()을 적을 때 부모의 것도 가져올지 말지를 고려하여 잘 적어야 한다.
}
