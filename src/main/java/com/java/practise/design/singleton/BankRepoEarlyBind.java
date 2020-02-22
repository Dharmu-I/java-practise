package com.java.practise.design.singleton;

public class BankRepoEarlyBind {

    private static BankRepoEarlyBind bankRepo = new BankRepoEarlyBind();

    private BankRepoEarlyBind(){
    }

    public static BankRepoEarlyBind getBankRepoInstance(){
        return bankRepo;
    }
}
