package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

public class SavingAccount extends Account {

    private double interest;

    public SavingAccount(int a, double interest){
        super(a);       // super()를 통해 슈퍼 클래스(Account)의 생성자를 명시적으로 호출
        this.interest = interest;
    }

    public void addinterest(){

        // getBalance로 현재 잔액에 이자를 더해서 deposit(예금)
        deposit(getBalance() * (interest/100));

    }


}