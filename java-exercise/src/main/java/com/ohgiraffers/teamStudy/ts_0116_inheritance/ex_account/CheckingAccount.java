package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

public class CheckingAccount extends Account {

    private double overDraft;

    public CheckingAccount (int a, double overDraft){
        super(a);
        this.overDraft = overDraft;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        this.print();
    }

    public void draft(double sum){
        double bal = getBalance();

        if(bal + overDraft >= sum){
            super.withdraw(sum);
        } else{
            System.out.println("부도. 인출 안됨.");
        }
    }


}