package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

public class CheckingAccount extends Account {

    public CheckingAccount(int a) {
        super(a);
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
    }

    @Override
    public void withdraw(double sum) {
        int overdraft = 20000;
        super.withdraw(sum);
        if (super.getBalance() + overdraft > 0) {
            System.out.println("수표 부도남");

        }
    }
}
