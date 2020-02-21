package com.java.practise.design.adapter;

public class BankCustomer extends BankDetails implements CreditCard {
    @Override
    public void giveBankDetails() {
        setAccountNumber("312321312312");
        setBankName("HDFC");
        setBranch("MUDHOL");
    }

    @Override
    public String getCreditCardDetails() {
        return getAccountNumber()+" validated by "+getBankName()+" located in "+getBranch();
    }
}
