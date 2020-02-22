package com.java.practise.design.abstractFactory;

public class CustomerFactory extends CustomerBankFactory {

    @Override
    Bank getBank(String bankType) throws Exception {
        return null;
    }

    @Override
    public Customer getCustomer(String customerType) throws Exception {
        if (customerType.equals("Permanent")){
            return new PermanentCustomer();
        }else if (customerType.equals("Guest")){
            return new GuestCustomer();
        }else {
            throw new Exception("Invalid customer type "+customerType);
        }
    }
}
