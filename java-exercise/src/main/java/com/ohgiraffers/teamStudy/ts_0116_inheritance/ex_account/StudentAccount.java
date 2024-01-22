package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

public class StudentAccount extends SavingAccount {
    private int withdrawYear;

    public StudentAccount(int a, double interest, int withdrawYear){
        super(a, interest);
        this.withdrawYear = withdrawYear;
    }

    public void studentWithdraw(double sum, int now){
        if(now < withdrawYear){
            System.out.println("아직 인출할 수 없습니다.");
        } else {
            withdraw(sum);
        }
    }


}
