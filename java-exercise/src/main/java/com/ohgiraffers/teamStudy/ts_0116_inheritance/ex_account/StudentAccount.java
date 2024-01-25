package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

import java.time.LocalDate;

public class StudentAccount extends SavingAccount {
    private int withdrawYear;
    private LocalDate localDate = LocalDate.now();


    private double studentInterestRate = 5.0;

    public StudentAccount(int a) {
        super(a);
    }

    public int getWithdrawYear() {
        return withdrawYear;
    }

    public void setWithdrawYear(int withdrawYear) {
        this.withdrawYear = withdrawYear;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public double getStudentInterestRate() {
        return studentInterestRate;
    }

    public void setStudentInterestRate(double studentInterestRate) {
        this.studentInterestRate = studentInterestRate;
    }

    public StudentAccount(int a, double studentInterestRate, int withdrawYear){
        super(a, studentInterestRate);
        this.withdrawYear = withdrawYear;
        this.studentInterestRate = studentInterestRate;
    }

    public void addInterest() {
        deposit(getBalance() * studentInterestRate);
        System.out.println("학생계좌에 이자 추가됨...");
    }

    public void withdraw(double sum, LocalDate now) {

    }

    public void studentWithdraw(double sum, int now){
        if(now < withdrawYear){
            System.out.println("아직 인출할 수 없습니다.");
        } else {
            withdraw(sum);
        }
    }


}
