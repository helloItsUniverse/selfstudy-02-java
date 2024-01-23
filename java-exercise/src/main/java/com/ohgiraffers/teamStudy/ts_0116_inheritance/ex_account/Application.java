package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Bank bank = new Bank();

        SavingAccount savingAccount1 = new SavingAccount(0, 0.01);
        savingAccount1.deposit(50000);
        SavingAccount savingAccount2 = new SavingAccount(1, 0.02);
        savingAccount2.deposit(50000);


        CheckingAccount checkingAccount = new CheckingAccount(2, 20);
        checkingAccount.deposit(100000);
        StudentAccount studentAccount = new StudentAccount(3, 0.05, 2030);
        studentAccount.deposit(30000);

//        bank.createAccount(savingAccount1);
//        bank.createAccount(savingAccount2);
//        bank.deleteAccount(savingAccount2);
//        bank.createAccount(checkingAccount);
//        bank.createAccount(studentAccount);



        System.out.println("===기존금액===");
        bank.print();
        System.out.println("===이자붙은거===");
        bank.addInterest();
        bank.print();

        System.out.println();
        System.out.println("===초과인출===");
        checkingAccount.draft(50000000);

        System.out.println();
        System.out.println("===학생적금깨기===");
        studentAccount.studentWithdraw(15000, 2024);


    }

}
