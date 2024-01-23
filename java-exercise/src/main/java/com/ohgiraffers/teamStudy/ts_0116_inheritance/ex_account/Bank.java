package com.ohgiraffers.teamStudy.ts_0116_inheritance.ex_account;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {


    private ArrayList<Account> accList;

    public Bank() {
        this.accList = new ArrayList<>();
    }



    public Account createAccount(Account account){
        accList.add(account);
        String accName = account.getClass().getSimpleName();
        System.out.println(accName + " 계좌 생성됨...");
        return account;
    }

    public void deleteAccount(Account account){
//        accarray[index--] = null;
        accList.remove(account);
        String accName = account.getClass().getSimpleName();
        System.out.println(accName + " 계좌 해지됨...");
    }

    public void addInterest(){
        for(Account account : accList){
            if((account instanceof SavingAccount) && !(account instanceof StudentAccount)){
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
