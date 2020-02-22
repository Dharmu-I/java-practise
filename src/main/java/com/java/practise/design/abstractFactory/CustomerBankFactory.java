package com.java.practise.design.abstractFactory;

public abstract class CustomerBankFactory {
    abstract Bank getBank(String bankType) throws Exception;
    abstract Customer getCustomer(String customerType) throws Exception;
}
