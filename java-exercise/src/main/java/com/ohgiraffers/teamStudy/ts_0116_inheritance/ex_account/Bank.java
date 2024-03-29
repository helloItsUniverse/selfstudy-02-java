package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank implements AccountInterface {


    private ArrayList<Account> accList = new ArrayList<>();

    public ArrayList<Account> getAccList() {
        return accList;
    }

    public void setAccList(ArrayList<Account> accList) {
        this.accList = accList;
    }

    public Bank() {
    }


//    public int getSAVING() {
//        return SAVING;
//    }
//
//    public int getSTUDENT() {
//        return STUDENT;
//    }
//
//    public int getCHECKING() {
//        return CHECKING;
//    }

    public Account findAccount(int accNumInput) {
        for(Account account: accList) {
            if (account.getAccountNumber() == accNumInput) {
                return account;
            }
        }
        return null;
    }

    public void createAccount(int accNum, int accType) {
        if (accType == SAVING) accList.add(new SavingAccount(accNum));
        else if (accType == STUDENT) accList.add(new StudentAccount(accNum));
        else if (accType == CHECKING) accList.add(new CheckingAccount(accNum));
        else System.out.println("잘못 입력하셨습니다.");

        String accKind = extractAccountKind(accList.get(accList.size() - 1));
        System.out.println("계좌번호 " + accList.get(accList.size() - 1).getAccountNumber() + " " + accKind + " 계좌가 개설되었습니다...");
    }

    public void setOverDraft() {
        System.out.print("초과인출 한도 금액을 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int userSelection = sc.nextInt();
        ((CheckingAccount)(accList.get(accList.size() - 1))).setOverDraft(userSelection);
        System.out.println("해당 수표계좌에 초과인출 한도 금액이 " + userSelection + "원 으로 설정되었습니다.");
    }



    public void deleteAccount(int accNum){
        Account account = findAccount(accNum);
        accList.remove(account);
        String accKind = extractAccountKind(account);
        System.out.println("계좌번호 " + account.getAccountNumber() + " " + accKind + " 계좌 해지됨...\n");
    }

    public void depositMoney() {
        inquiryAccountList();
        System.out.print("입금할 계좌의 계좌번호를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int accNum = sc.nextInt();

        Account account = findAccount(accNum);
        String accKind = extractAccountKind(account);
        System.out.println("계좌번호 " + account.getAccountNumber() + " " + accKind + " 계좌에 입금할 금액을 입력하세요: ");

        int userInput = sc.nextInt();
        account.deposit(userInput);
        System.out.println("계좌번호 " + account.getAccountNumber() + " " + accKind + " 계좌에 " + userInput + "원 만큼 입금되었습니다.");
//        for (Account account: accList) {
//            if (account.getAccountNumber() == accNum) {
//                String accKind = extractAccountKind(account);
//                System.out.println("계좌번호 " + account.getAccountNumber() + " " + accKind + " 계좌에 입금할 금액을 입력하세요: ");
//
//                int userInput = sc.nextInt();
//                account.deposit(userInput);
//                System.out.println("계좌번호 " + account.getAccountNumber() + " " + accKind + " 계좌에 " + userInput + "원 만큼 입금되었습니다.");
//                break;
//            }
//        }
    }

    public void inquiryAccountList() {
        System.out.println("\n================== 계좌 목록 ==================\n");
        if (!accList.isEmpty()) {
            for (Account account : accList) {
                templatePrintAccount(account);
            }
        } else {
            System.out.println("개설된 계좌가 없습니다.");
        }
        System.out.println("\n=============================================\n");
    }

    public void inquiryAccount(int accNum) {
        System.out.println("\n================== 계좌 조회 ==================\n");
        Account account = findAccount(accNum);
        if (account != null) templatePrintAccount(account);
        else System.out.println("조회된 계좌가 없습니다.\n계좌를 개설하거나 계좌번호를 다시 입력해주세요.");
        System.out.println("\n=============================================\n");

    }

    public void addInterest(){
        for(Account account : accList){
            if((account instanceof SavingAccount) && !(account instanceof StudentAccount)){     // 학생계좌가 아닌 적금계좌
                ((SavingAccount)account).addInterest();
            }
            if(account instanceof StudentAccount){
                ((StudentAccount)account).addInterest();
            }
        }
    }

    public String extractAccountKind(Account account) {
        String accKind = "";
        String accName = account.getClass().getSimpleName();
        switch (accName){
            case "SavingAccount":
                accKind = "적금";
                break;
            case "CheckingAccount":
                accKind = "수표";
                break;
            case "StudentAccount":
                accKind = "학생";
                break;
        }
        return accKind;
    }

    public void templatePrintAccount(Account account) {
        String accKind = extractAccountKind(account);
        System.out.print(accKind + "계좌 | " +
                account.toString().substring(0,7) + "-" +
                account.toString().substring(7,10) + "-" +
                account.toString().substring(10) + "원");

        // 적금계좌의 경우
        if ((account instanceof SavingAccount) && !(account instanceof StudentAccount)) {
            System.out.print(" | 이자율: ");
            System.out.println(((SavingAccount) account).getInterestRate() + "%");

            // 학생계좌의 경우
        } else if (account instanceof StudentAccount) {
            System.out.print(" | 이자율: ");
            System.out.println(((StudentAccount) account).getStudentInterestRate() + "%");

            // 수표계좌의 경우
        } else if (account instanceof CheckingAccount) {
            System.out.print(" | 초과인출한도: ");
            System.out.println(((CheckingAccount) account).getOverDraft() + "원");
        }
    }

    public void print(){
        for (int i = 0; i < accList.size(); i++) {       // .length?
            accList.get(i).print();
        }
    }

    public void printMainMenu() {
        System.out.println(
                "                                                                                          \n" +
                "                                                                                          \n" +
                "                                                                                          \n" +
                "                                                                                          \n" +
                "                                                                                          \n" +
                "                             ,&(((((&                ##(((/%,                             \n" +
                "                            @((((***(&              @((((***(&                            \n" +
                "                           %((((((((((#            ,((((((((((#                           \n" +
                "                          @(((((((((((@            @(((((((((((&                          \n" +
                "                         *(((((((((((((            %((((((((((((%                         \n" +
                "                         @(((((((((((((            (((((((((((((%                         \n" +
                "                         (((((((((&@@/               /@@#((((((((,                        \n" +
                "                        %((((@.                             (@(((&                        \n" +
                "                        @(@  .@@@@&                     (@@@@*  @@                        \n" +
                "                        @   *       .                 ,       ..  #                       \n" +
                "                       .                                            ,                     \n" +
                "                      *                                                                   \n" +
                "                     @      @@@@@@@@@/               .@@@@@@@@@,     #                    \n" +
                "                     .   &@@@@@@.    @@&            &@@@@@@.    @@&   ,                   \n" +
                "                    *   @%@@@@&       *@           &@@@@@.       @@   %                   \n" +
                "                    #   &@@@@@@       &@           @@@@@@        @.   @                   \n" +
                "                    &   &@@@&&@@@%*#@&(&           @@@@#&@%    *(@,   &                   \n" +
                "                    %     @(  (@@@&####            .%#,  @@@@%###.    .                   \n" +
                "                   .        .,*/((#/*.               .*/((((/,.        @                  \n" +
                "                  &#                                                    @                 \n" +
                "                 (.,                                                    */                \n" +
                "                ,../                    * _ _ _ _ *                    @..                \n" +
                "                 /...@                                              .(...%                \n" +
                "                  &...,,@..                                   ....(#,,,.@                 \n" +
                "                            (&....                    .......*@                           \n" +
                "                                  ,*%@&#/,........,/%@%**                                 \n" +
                "                                  .......@       &.......                                 \n" +
                "                                  ,......@       &......,                                 \n" +
                "                                  ./....*,        #....&                                  \n" +
                "                                                                                          \n" +
                "                                                                                          ");
        System.out.println("\n======== 쿵야은행 ========");
        System.out.print("Select\n" +
                "1 for 계좌 개설\n" +
                "2 for 전체 계좌 조회\n" +
                "3 for 특정 계좌 조회\n" +
                "4 for 계좌 해지\n" +
                "5 for 예금 적금\n" +
                "6 for 예금 인출\n" +
                "9 for 프로그램 종료\n" +
                "선택하십시오: ");
    }

    public void printCreateAccountMenu() {
        System.out.println("\n======== 계좌 개설 ========");
        System.out.print("Select\n" +
                "1 for 적금계좌 개설\n" +
                "2 for 학생적금계좌 개설\n" +
                "3 for 수표계좌 개설\n" +
                "선택하십시오: ");
    }

    public void printDeleteAccountMenu() {
        System.out.println("\n======== 계좌 해지 ========");
        inquiryAccountList();
        System.out.print("해지할 계좌의 계좌번호를 입력하십시오: ");
    }



}