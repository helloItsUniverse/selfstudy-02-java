package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

import java.util.Random;
import java.util.Scanner;

public class Application2 implements AccountInterface{
    public static void main(String[] args) {
        Bank bank = new Bank();
        boolean run = true;
        int userSelection = 0;

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
                            bank.createAccount(makeRandomAccountNumber(), SAVING);
                            break;
                        case STUDENT:
                            bank.createAccount(makeRandomAccountNumber(), STUDENT);
                            break;
                        case CHECKING:
                            bank.createAccount(makeRandomAccountNumber(), CHECKING);
                            bank.setOverDraft();
                            break;
                    }
                    break;

                case INQUIRY_ALL_ACCOUNTS:
                    bank.inquiryAccountList();
                    break;

                case INQUIRY_ACCOUNT:
                    System.out.print("조회할 계좌의 계좌번호를 입력하세요: ");
                    bank.inquiryAccountList();
                    userSelection = sc.nextInt();
                    bank.inquiryAccount(userSelection);
                    break;

                case DELETE_ACCOUNT:
                    bank.printDeleteAccountMenu();
                    userSelection = sc.nextInt();
                    bank.deleteAccount(userSelection);
                    break;

                case DEPOSIT:
                    bank.depositMoney();
                    break;

                case WITHDRAW:
                    break;

                case TERMINATION:
                    System.out.println("프로그램이 종료됩니다.");
                    run = false;
                    break;
            }
        }
    }

    private static int makeRandomAccountNumber() {
        Random random = new Random();
        return random.nextInt(1100000000, 1109999999);
    }
}
