package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

import java.util.Random;
import java.util.Scanner;

public class Application2 implements AccountInterface{
    public static void main(String[] args) {
        Bank bank = new Bank();
        boolean run = true;
        int userSelection = 0;
        Random randomAccountNumber = new Random();

        Scanner sc = new Scanner(System.in);

        while (run) {
            bank.printMainMenu();
            userSelection = sc.nextInt();

            switch (userSelection) {
                case CREATE_ACCOUNT:
                    bank.printCreateAccountMenu();
                    userSelection = sc.nextInt();
                    switch (userSelection) {
                        case SAVING:
                            bank.createAccount(randomAccountNumber.nextInt(), SAVING);
                            break;
                        case STUDENT:
                            bank.createAccount(randomAccountNumber.nextInt(), STUDENT);
                            break;
                        case CHECKING:
                            bank.createAccount(randomAccountNumber.nextInt(), CHECKING);
                            userSelection = sc.nextInt();
                            ((CheckingAccount)(bank.getAccList().get(bank.getAccList().size() - 1))).setOverDraft(userSelection);
                            break;
                    }
                    break;

                case INQUIRY_ACCOUNTS:
                    bank.inquiryAccountList();
                    break;

                case DELETE_ACCOUNT:
                    bank.printDeleteAccountMenu();
                    userSelection = sc.nextInt();
                    bank.deleteAccount(userSelection);
                    break;

                case TERMINATION:
                    System.out.println("프로그램이 종료됩니다.");
                    run = false;
                    break;
            }
        }
    }


}
