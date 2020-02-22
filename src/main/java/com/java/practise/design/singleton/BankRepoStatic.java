package com.java.practise.design.singleton;

public class BankRepoStatic {

    private static BankRepoStatic bankRepo = null;

    private BankRepoStatic(){
    }

    public static BankRepoStatic getBankRepo(){
        if (bankRepo == null){
            bankRepo = new BankRepoStatic();
        }
        return bankRepo;
    }
}
