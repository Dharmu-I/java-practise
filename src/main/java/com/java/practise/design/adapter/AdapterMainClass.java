package com.java.practise.design.adapter;

public class AdapterMainClass {

    public static void main(String[] args) {
        CreditCard creditCard = new BankCustomer();
        creditCard.giveBankDetails();
        System.out.println(creditCard.getCreditCardDetails());
    }
}
