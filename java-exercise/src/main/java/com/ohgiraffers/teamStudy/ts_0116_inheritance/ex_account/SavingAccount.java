package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

public class SavingAccount extends Account {

    private double interestRate = 0.01;
    public SavingAccount(int a) {
        super(a);
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        System.out.println(super.toString());
        addInterest(super.getBalance());
    }

    public void addInterest(double bal) {
        bal = bal + bal * interestRate;
        System.out.println("이자 추가됨...");
        System.out.println(super.toString());
    }
}
