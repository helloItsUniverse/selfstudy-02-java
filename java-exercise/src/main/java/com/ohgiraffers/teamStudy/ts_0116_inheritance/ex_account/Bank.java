package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

import java.util.Scanner;

public class Bank {

    Account[] accarray;
    int index = 0;


    public Bank(int num){
        accarray = new Account[num];
    }

    public void createAccount(Account account){
        accarray[index++] = account;
    }

    public void deleteAccount(Account account){
        accarray[index--] = null;
    }

    public void addinterest(){
        for(Account account : accarray){
            if(account instanceof SavingAccount){
                ((SavingAccount)account).addinterest();
            }
        }
    }

    public void print(){
        for (int i = 0; i < index; i++) {       // .length?
            accarray[i].print();
        }
    }


}
