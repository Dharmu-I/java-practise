package com.java.practise.design.factory;

public class FactoryMainClass {

    public static void main(String[] args) {
        Bank bank = BankFactory.getBank("SBI");
        if (bank != null) {
            System.out.println(bank.getName());
        }
    }
}
