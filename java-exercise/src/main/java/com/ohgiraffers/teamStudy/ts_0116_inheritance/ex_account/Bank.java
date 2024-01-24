package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {


    private ArrayList<Account> accList = new ArrayList<>();

    public Bank() {
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

    public void createAccount(Account account){
        accList.add(account);
        String accKind = extractAccountKind(account);
        System.out.println("계좌번호 " + account.getAccountNumber() + " " + accKind + " 계좌 생성됨...");
    }

    public void deleteAccount(Account account){
        accList.remove(account);
        String accKind = extractAccountKind(account);
        System.out.println("계좌번호 " + account.getAccountNumber() + " " + accKind + " 계좌 해지됨...");
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

    public void print(){
        for (int i = 0; i < accList.size(); i++) {       // .length?
            accList.get(i).print();
        }
    }


}