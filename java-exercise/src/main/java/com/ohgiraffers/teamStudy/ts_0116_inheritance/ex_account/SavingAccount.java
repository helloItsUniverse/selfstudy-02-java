package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

public class SavingAccount extends Account {

    private double interestRate;

    public SavingAccount(int a, double interestRate){
        super(a);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        deposit(super.getBalance() * interestRate);
        System.out.println("적금계좌에 이자 추가됨...");
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
//        this.print();
    }
}