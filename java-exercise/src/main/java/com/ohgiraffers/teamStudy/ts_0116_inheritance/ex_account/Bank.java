package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int accnum = sc.nextInt();

        Account[] account = new Account[4];
        account[0] = new Account(accnum);
        account[1] = new SavingAccount(accnum);
        account[2] = new CheckingAccount(accnum);
        account[3] = new StudentAccount(accnum);




    }
}
