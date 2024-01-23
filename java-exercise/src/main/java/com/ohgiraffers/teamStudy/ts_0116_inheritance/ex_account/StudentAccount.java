package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

public class StudentAccount extends SavingAccount {
    private int withdrawYear;

    private double studentInterestRate;

    public StudentAccount(int a, double studentInterestRate, int withdrawYear){
        super(a, studentInterestRate);
        this.withdrawYear = withdrawYear;
        this.studentInterestRate = studentInterestRate;
    }


    public void addInterest() {
        deposit(super.getBalance() * studentInterestRate);
        System.out.println("학생계좌에 이자 추가됨...");
    }


    //    public void addInterest(){
//        deposit(getBalance() * studentInterestRate);
//        System.out.println("학생계좌에 이자 추가됨...");
//    }

    public void studentWithdraw(double sum, int now){
        if(now < withdrawYear){
            System.out.println("아직 인출할 수 없습니다.");
        } else {
            withdraw(sum);
        }
    }


}
