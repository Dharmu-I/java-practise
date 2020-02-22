package com.java.practise.design.abstractFactory;

public class FactoryCreator {
    public static CustomerBankFactory getType(String argType) throws Exception {
        if (argType.equals("bank")){
            return new BankFactory();
        }else if (argType.equals("customer")){
            return new CustomerFactory();
        }else {
            throw new Exception("Invalid arg type");
        }
    }
}
