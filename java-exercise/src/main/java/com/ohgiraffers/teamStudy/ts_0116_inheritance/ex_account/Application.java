package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        SavingAccount savingAccount = new SavingAccount(0, 1.5);
        savingAccount.deposit(50000);
        CheckingAccount checkingAccount = new CheckingAccount(1, 20);
        checkingAccount.deposit(100000);
        StudentAccount studentAccount = new StudentAccount(2, 3.5, 2030);
        studentAccount.deposit(30000);

        Bank bank = new Bank(5);
        bank.createAccount(savingAccount);
        bank.createAccount(checkingAccount);
        bank.createAccount(studentAccount);


        System.out.println("===기존금액===");
        bank.print();
        System.out.println("===이자붙은거===");
        bank.addinterest();
        bank.print();

        System.out.println();
        System.out.println("===초과인출===");
        checkingAccount.draft(50000000);

        System.out.println();
        System.out.println("===학생적금깨기===");
        studentAccount.studentWithdraw(15000, 2024);


    }

}
