package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {


    private ArrayList<Account> accList;

    public Bank() {
        this.accList = new ArrayList<>();
    }

    Account[] accarray;
    int index = 0;


    public Bank(int num){
        accarray = new Account[num];
    }

    public void createAccount(Account account){
//        accarray[index++] = account;
        accList.add(account);
        String accName = account.getClass().getSimpleName();
        System.out.println(accName + " 계좌 생성됨...");
    }

    public void deleteAccount(Account account){
//        accarray[index--] = null;
        accList.remove(account);
        String accName = account.getClass().getSimpleName();
        System.out.println(accName + " 계좌 해지됨...");
    }

    public void addInterest(){
        for(Account account : accList){
            if(account instanceof SavingAccount){
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
