package com.java.practise.design.abstractFactory;

public class MainClass {

    public static void main(String[] args) throws Exception {
        CustomerBankFactory bank = FactoryCreator.getType("bank");
        CustomerBankFactory customer = FactoryCreator.getType("customer");
        bank.getBank("SBI").createBankAccount();
        bank.getBank("HDFC").createBankAccount();
        customer.getCustomer("Permanent").createCustomer();
        customer.getCustomer("Guest").createCustomer();
    }
}
