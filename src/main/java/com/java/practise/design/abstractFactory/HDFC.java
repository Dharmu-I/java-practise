package com.java.practise.design.abstractFactory;

public class HDFC implements Bank {
    @Override
    public void createBankAccount() {
        System.out.println("Bank account created at HDFC");
    }
}
