package com.java.practise.design.abstractFactory;

public class SBI implements Bank {
    @Override
    public void createBankAccount() {
        System.out.println("Created account in SBI");
    }
}
