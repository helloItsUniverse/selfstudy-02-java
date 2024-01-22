package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int accnum = sc.nextInt();
//        Account account = new Account(accnum);
//        account.deposit(10000);
//        System.out.println(account);
//        account.withdraw(20000);
//        account.withdraw(-30000);
//        System.out.println(account);

        System.out.println("=========================");
        Account account1 = new SavingAccount(234);
        System.out.println(account1);
        account1.deposit(10000);

//        System.out.println("=========================");
//        Account account2 = new CheckingAccount(345);
//        System.out.println(account2);
//        account2.deposit(20000);
//        account2.withdraw(50000);



    }
}
