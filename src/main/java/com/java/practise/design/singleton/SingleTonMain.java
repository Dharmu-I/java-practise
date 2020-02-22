package com.java.practise.design.singleton;

public class SingleTonMain {

    public static void main(String[] args) {
        System.out.println(BankRepoStatic.getBankRepo());
        System.out.println(BankRepoStatic.getBankRepo());
        System.out.println(BankRepoEarlyBind.getBankRepoInstance());
        System.out.println(BankRepoEarlyBind.getBankRepoInstance());
    }
}
